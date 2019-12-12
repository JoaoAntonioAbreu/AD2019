/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raspberryazure.events;

import com.microsoft.azure.sdk.iot.device.DeviceTwin.DeviceMethodCallback;
import com.microsoft.azure.sdk.iot.device.DeviceTwin.DeviceMethodData;

/**
 *
 * @author Turma A
 */
public class DirectMethodCallback implements DeviceMethodCallback{
    
      // Define method response codes
  private static final int METHOD_SUCCESS = 200;
  private static final int METHOD_NOT_DEFINED = 404;
  private static final int INVALID_PARAMETER = 400;

  private static int minimumDistance = 0;

    public static void setMinimumDistance(int minimumDistance) {
      System.out.println("Direct method # Setting minumum distance: " + minimumDistance);
      minimumDistance = minimumDistance;
    }
  
   

    @Override
    public DeviceMethodData call(String methodName, Object methodData, Object context)
    {
      DeviceMethodData deviceMethodData;
      String minDistance = new String((byte[])methodData);
      switch (methodName)
      {
        case "SetTelemetryInterval" :
        {
          int distance;
          try {
            int status = METHOD_SUCCESS;
            distance = Integer.parseInt(minDistance);
            System.out.println(minDistance);
            setMinimumDistance(distance);
            deviceMethodData = new DeviceMethodData(status, "Executed direct method " + methodName);
          } catch (NumberFormatException e) {
            int status = INVALID_PARAMETER;
            deviceMethodData = new DeviceMethodData(status, "Invalid parameter " + minDistance);
          }
          break;
        }
        default:
        {
          int status = METHOD_NOT_DEFINED;
          deviceMethodData = new DeviceMethodData(status, "Not defined direct method " + methodName);
        }
      }
      return deviceMethodData;
    }
}
