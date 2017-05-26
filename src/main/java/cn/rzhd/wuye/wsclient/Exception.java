
/**
 * Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package cn.rzhd.wuye.wsclient;

public class Exception extends java.lang.Exception{
    
    private cn.rzhd.wuye.wsclient.IExamDataServiceStub.ExceptionE faultMessage;

    
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
    

    public void setFaultMessage(cn.rzhd.wuye.wsclient.IExamDataServiceStub.ExceptionE msg){
       faultMessage = msg;
    }
    
    public cn.rzhd.wuye.wsclient.IExamDataServiceStub.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    