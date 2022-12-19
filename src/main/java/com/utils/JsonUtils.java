package com.utils;

import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;
import com.enums.UserConfig;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JsonUtils {

        private JsonUtils(){

        }

        private static Map<String,String> CONFIGMAP=new HashMap<>();

        static{
            try {
                CONFIGMAP=new ObjectMapper().readValue(new File(FrameworkConstants.getJsonFile()),HashMap.class);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    public static String getValue(UserConfig key) {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new RuntimeException("Property Name " + key + " is not found");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }



}
