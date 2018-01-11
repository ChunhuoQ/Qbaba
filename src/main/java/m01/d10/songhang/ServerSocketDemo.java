/**
 * Project Name:Qbaba
 * File Name:ServerSocketDemo.java
 * Package Name:m01.d10.songhang
 * Date:2018年1月10日下午7:45:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.songhang;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午7:45:36 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class ServerSocketDemo {

    public static void main(String[] args) {

        System.out.println("服务端接收.......");
        OutputStream os = null;
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            serverSocket = new ServerSocket(6666);
            socket = serverSocket.accept();
            is = socket.getInputStream();
            int b = -1;
            while ((b = is.read()) != -1) {
                baos.write(b);
            }
            byte[] byteAry = baos.toByteArray();
            // String str = new String(byteAry);
            // System.out.println(str);
            String path = "D:\\git\\Qbaba\\SERVER.txt";
            File file = new File(path);
            fos = new FileOutputStream(file);
            fos.write(byteAry);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                {
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
