package br.com.q4auditoria.web.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

public final class Converter {
	
	public static final Logger logger = Logger.getLogger(Converter.class);
	
	public static String convertStringToMd5(String valor) {
        MessageDigest mDigest;
        try { 

        	  mDigest = MessageDigest.getInstance("MD5");
                     
              byte[] valorMD5 = mDigest.digest(valor.getBytes("UTF-8"));
              
              StringBuffer sb = new StringBuffer();
              for (byte b : valorMD5){
                     sb.append(Integer.toHexString((b & 0xFF) |
                     0x100).substring(1,3));
              }
  
              return sb.toString();
                     
        } catch (NoSuchAlgorithmException e) {
        	  logger.error(e.getMessage(), e);
              return null;
        } catch (UnsupportedEncodingException e) {
      	      logger.error(e.getMessage(), e);
              return null;
        }
 }

}
