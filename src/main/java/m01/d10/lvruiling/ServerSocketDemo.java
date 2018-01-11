/**
 * Project Name:Demo
 * File Name:ServerSocketDemo.java
 * Package Name:Demo20180110
 * Date:2018年1月10日下午4:38:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.lvruiling;

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
 * Date: 2018年1月10日 下午4:38:43 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class ServerSocketDemo {
    int port = 8888;

    OutputStream os = null;

    ServerSocket serversocket = null;

    Socket socket = null;

    ByteArrayOutputStream lvs = new ByteArrayOutputStream();

    FileOutputStream fos = null;
    {
        try {
            serversocket = new ServerSocket(port);
            socket = serversocket.accept();
            InputStream is = socket.getInputStream();
            int b = -1;
            while ((b = is.read()) != -1) {
                lvs.write(b);
            }
            byte[] byteAry = lvs.toByteArray();
            String str = new String(byteAry);
            System.out.println(str);
            String path = "D:\\server";
            File file = new File(path);
            fos = new FileOutputStream(file);
            fos.write(byteAry);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
            if (serversocket != null) {
                try {
                    serversocket.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
        }
    }
}