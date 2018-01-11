/**
 * Project Name:dt59homework
 * File Name:ServerFile.java
 * Package Name:hw20180110
 * Date:2018年1月10日下午10:13:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.dusen;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午10:13:21 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class ServerFile {

    public static void main(String[] args) {
        System.out.println("开始接收");
        int port = 10000;
        ServerSocket serverocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            serverocket = new ServerSocket(port);
            socket = serverocket.accept();
            is = socket.getInputStream();
            int b = -1;
            while ((b = is.read()) != -1) {
                baos.write(b);
            }
            byte[] byteAry = baos.toByteArray();
            String path = "E:\\123.txt";
            File file=new File(path);
            //写入文件
            fos = new FileOutputStream(file);
            //写入文件
            fos.write(byteAry);
            
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverocket != null) {
                try {
                    serverocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
