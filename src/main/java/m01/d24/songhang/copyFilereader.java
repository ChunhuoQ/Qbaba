/**
 * Project Name:Qbaba
 * File Name:copyFilereader.java
 * Package Name:m01.d24.songhang
 * Date:2018年1月24日下午6:38:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.songhang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月24日 下午6:38:33 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class copyFilereader {

    public static void main(String[] args) {

        BufferedReader fis = null;
        FileReader fos = null;
        // InputStream frs=null;

        BufferedWriter his = null;
        FileWriter hos = null;
        // OutputStream hrs=null;
        try {
            // frs=new FileInputStream("D:\\git\\songhang724\\new4.txt");
            fos = new FileReader("D:\\git\\songhang724\\new4.txt");
            fis = new BufferedReader(fos);

            hos = new FileWriter("E:\\222.txt");
            his = new BufferedWriter(hos);

            String str = fis.readLine();
            while (str != null) {
                his.write(str + "\r\n");
                str = fis.readLine();
            }
            System.out.println("读写完成");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                his.close();
                hos.close();
                fis.close();
                fos.close();
            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }
}
