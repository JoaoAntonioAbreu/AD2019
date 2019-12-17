/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projecto_2.events;

import com.microsoft.azure.sdk.iot.device.DeviceTwin.DeviceMethodCallback;
import com.microsoft.azure.sdk.iot.device.DeviceTwin.DeviceMethodData;

/**
 *
 * @author Turma A
 */

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
  
   private void setMinimumDistance(int minDistance)
    {
      System.out.println("Direct method # Setting telemetry interval (seconds): " + minDistance);
      minimumDistance = minDistance;
    }

    @Override
    public DeviceMethodData call(String methodName, Object methodData, Object context)
    {
      DeviceMethodData deviceMethodData;
      String payload = new String((byte[])methodData);
      switch (methodName)
      {
        case "setMinimumDistance" :
        {
          int minDistance;
          try {
            int status = METHOD_SUCCESS;
            minDistance = Integer.parseInt(payload);
            System.out.println(payload);
            setMinimumDistance(minDistance);
            deviceMethodData = new DeviceMethodData(status, "Executed direct method " + methodName);
          } catch (NumberFormatException e) {
            int status = INVALID_PARAMETER;
            deviceMethodData = new DeviceMethodData(status, "Invalid parameter " + payload);
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

