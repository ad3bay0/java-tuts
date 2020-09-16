package com.ad3bay0.tuts.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Util {

    public static void main(String[] args) throws Exception {
     
        System.out.println(convertStringtoBase64String("byte : byte"));
    }

    public static String convertStringtoBase64String(String data) throws UnsupportedEncodingException {

      return Base64.getEncoder().encodeToString(data.getBytes("utf-8"));
    }
}
