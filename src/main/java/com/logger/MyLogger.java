package com.logger;

import com.constants.FrameworkConstants;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLogger {
    private static boolean root=false;

    private MyLogger(){}



        private  static Logger getLogger (Class cls){
            if(!root){
                PropertyConfigurator.configure(FrameworkConstants.getLoggerFile());
                root=true;
            }
            return Logger.getLogger(cls);
        }
        public static void setInfo(Class cls,String message){
            getLogger(cls).info(message);
        }
        public static void setFail(Class cls,String message){
            getLogger(cls).error(message);
        }
    }


