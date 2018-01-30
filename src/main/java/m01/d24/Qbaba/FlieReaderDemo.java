/**
 * Project Name:Qbaba
 * File Name:FlieReaderDemo.java
 * Package Name:m01.d24
 * Date:2018年1月24日下午7:47:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.Qbaba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午7:47:48 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class FlieReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        FileReader isrr = null;
        File iss = null;
        BufferedWriter bw = null;
        FileWriter osw = null;
        File ost = null;

        try {

            iss = new File("d:\\计算机基础知识.txt");
            isrr = new FileReader(iss);
            br = new BufferedReader(isrr);

            ost = new File("e:\\222.txt");
            osw = new FileWriter(ost);
            bw = new BufferedWriter(osw);

            String str = br.readLine();

            while (str != null) {
                bw.write(str + "\r\n");
                str = br.readLine();
            }
            System.out.println("缓冲字符流读写完成！");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                osw.close();
                
                br.close();
                isrr.close();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
