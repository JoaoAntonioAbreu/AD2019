/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raspberryazure;

import com.microsoft.azure.sdk.iot.device.*;
import com.mycompany.raspberryazure.events.DirectMethodCallback;
import com.mycompany.raspberryazure.events.DirectMethodStatusCallback;
import com.mycompany.raspberryazure.events.EventCallback;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;

import java.io.*;
import java.net.URISyntaxException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Device extends javax.swing.JFrame {

    private static String connString = "HostName=Smart-Termo-IoT.azure-devices.net;DeviceId=MyJavaDevice;SharedAccessKey=/Hu0m+q2O71ChqhbZ+7vcYNsUfvUjYRQTTCc7FGFaH4=";

    // Using the MQTT protocol to connect to IoT Hub
    private static IotHubClientProtocol protocol = IotHubClientProtocol.MQTT;
    private static DeviceClient client;

    public Device() throws URISyntaxException, IOException, InterruptedException {
        initComponents();

        // Connect to the IoT hub.
        client = new DeviceClient(connString, protocol);
        client.open();
// Register to receive direct method calls.
        client.subscribeToDeviceMethod(new DirectMethodCallback(), null, new DirectMethodStatusCallback(), null);
        simulateDevice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Device().setVisible(true);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Device.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Device.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Device.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    private static GpioPinDigitalOutput sensorTriggerPin;
    private static GpioPinDigitalInput sensorEchoPin;

    private void simulateDevice() throws InterruptedException {
        try {
            final GpioController gpio = GpioFactory.getInstance();

            // Trigger pin as OUTPUT
            sensorTriggerPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
            // Echo pin as INPUT
            sensorEchoPin = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);

            while (true) {

                Thread.sleep(2000);
                sensorTriggerPin.high(); // Make trigger pin HIGH
                Thread.sleep((long) 0.01);// Delay for 10 microseconds
                sensorTriggerPin.low(); //Make trigger pin LOW

                while (sensorEchoPin.isLow()) { //Wait until the ECHO pin gets HIGH

                }
                long startTime = System.nanoTime(); // Store the surrent time to calculate ECHO pin HIGH time.
                while (sensorEchoPin.isHigh()) { //Wait until the ECHO pin gets LOW

                }
                long endTime = System.nanoTime(); // Store the echo pin HIGH end time to calculate ECHO pin HIGH time.

                double currentDistance = ((((endTime - startTime) / 1e3) / 2) / 29.1);
                TelemetryDataPoint telemetryDataPoint = new TelemetryDataPoint();
                telemetryDataPoint.distance = currentDistance;
                String msgStr = telemetryDataPoint.serialize();
                Message msg = new Message(msgStr);
                msg.setProperty("Distance:alert", (currentDistance > 30) ? "true" : "false");
                System.out.println("Sending message: " + msgStr);
                Object lockobj = new Object();
                // Send the message.
                EventCallback callback = new EventCallback();
                client.sendEventAsync(msg, callback, lockobj);

                synchronized (lockobj) {
                    lockobj.wait();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Finished.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
