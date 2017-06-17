
/**
 * Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package cn.rzhd.wuye.uploadclient;

public class Exception extends java.lang.Exception{
    
    private IMsgReceiveServiceStub.ExceptionE faultMessage;

    
        public Exception() {
            super("Exception");
        }

        public Exception(java.lang.String s) {
           super(s);
        }

        public Exception(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public Exception(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(IMsgReceiveServiceStub.ExceptionE msg){
       faultMessage = msg;
    }
    
    public IMsgReceiveServiceStub.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    