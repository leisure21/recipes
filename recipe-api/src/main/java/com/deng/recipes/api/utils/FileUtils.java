package com.deng.recipes.api.utils;

import com.google.common.base.Preconditions;
import info.monitorenter.cpdetector.io.*;

import java.io.*;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hcdeng on 2017/4/21.
 */
public class FileUtils {

    private FileUtils() {
    }

    public static boolean saveFile(String content, String path, String fileName) {
        if (makeDir(path))
            return saveFile(content, path + "/" + fileName);
        else return false;
    }

    public static boolean makeDir(String path) {
        File dir = null;
        boolean res = true;
        try {
            dir = new File(path);
            if (!dir.exists()) dir.mkdirs();
            else if (!dir.isDirectory()) res = false;
        } catch (Exception e) {
            res = false;
        } finally {
            dir = null;
        }

        return res;
    }

    public static boolean saveFile(String content, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("fail to save file " + e.getMessage());
            return false;
        } finally {
            if (writer != null) try {
                writer.close();
            } catch (IOException e) {}
        }
    }

    public static String url2FileName(String url) {
        Preconditions.checkNotNull(url);

        int dotIdx = url.lastIndexOf('/');
        if (dotIdx < 0) dotIdx = 0;

        return url.hashCode() + url.substring(dotIdx);
    }

    public static String readFile(String fileName) {
        String charset = getFileCharSet(fileName);
        StringBuilder sb = new StringBuilder();
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
             fis = new FileInputStream(fileName);
             br = new BufferedReader(new InputStreamReader(fis, charset));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {

        } finally {
            if (fis != null) try {
                fis.close();
            } catch (IOException e) {}
        }

        return sb.toString();
    }

    private static String getFileCharSet(String path) {
        CodepageDetectorProxy detector =
                CodepageDetectorProxy.getInstance();
        detector.add(new ParsingDetector(false));
        detector.add(JChardetFacade.getInstance());
        detector.add(ASCIIDetector.getInstance());
        detector.add(UnicodeDetector.getInstance());
        Charset charset = Charset.forName("UTF-8");
        File f = new File(path);
        try {
            charset = detector.detectCodepage(f.toURI().toURL());
            System.out.println("charset:" + charset);
        } catch (Exception ex) {
            System.out.println("unkown charset, return default UTF-8:" + ex.getMessage());
        } finally {
            return charset.name();
        }
    }

    public static String getMD5(String input) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            byte[] inputByteArray = input.getBytes();
            messageDigest.update(inputByteArray);
            byte[] resultByteArray = messageDigest.digest();
            return byteArrayToHex(resultByteArray);

        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static String byteArrayToHex(byte[] byteArray) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] resultCharArray = new char[byteArray.length * 2];
        int index = 0;
        for (byte b : byteArray) {

            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        return new String(resultCharArray);
    }
}
