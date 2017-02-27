package by.topic.one.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aliaksandr_Vasilevic on 2/15/2017.
 */
public class FileAction {
    public static String readFile() {
        String filename = "input/txt/text.txt";
        File file = new File(filename);
//        show path to main.java
//        System.out.println(file.getAbsolutePath());
        InputStream inputStream = null;
        try {
            if (file.exists()) {
                inputStream = new FileInputStream(file);
//                outputStream = new FileOutputStream(file); //need close mandatory
                byte[] buf = new byte[1024];
                int length;
                String str = "";
                while ((length = inputStream.read(buf)) != -1) {
                    str += new String(buf, 0, length, StandardCharsets.UTF_8);
                }
//                System.out.println(str);
                return str;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                //log
            }
        }
        return "";
    }
    public static void writeFile (String s) {
        long time = System.currentTimeMillis(); //not obligatary
//        Date date = new Date(time);
        SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
        String filename = "output/txt/out_"+sd.format(time)+".txt";

        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(filename,false);
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
