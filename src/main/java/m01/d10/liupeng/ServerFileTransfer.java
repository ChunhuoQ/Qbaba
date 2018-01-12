/**
 * Project Name:Test201801
 * File Name:ServerSocketDemo.java
 * Package Name:test0110
 * Date:2018年1月10日下午4:34:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.liupeng;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:   <br/>
 * Date:     2018年1月10日 下午4:34:10 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class ServerFileTransfer {

    public static void main(String[] args) {

        ServerSocket serversocket = null;
        Socket socket = null;
        OutputStream os = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            serversocket = new ServerSocket(9090);
            socket = serversocket.accept();
            InputStream is = socket.getInputStream();
            int b = -1;
            while ((b = is.read()) != -1) {
                baos.write(b);
            }
            byte[] byteAry = baos.toByteArray();
            String path = "H:\\上课留记123.ZIP";
            File file = new File(path);
            fos = new FileOutputStream(file);
            fos.write(byteAry);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            haha(serversocket);
            haha(socket);
            haha(os);

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    static void haha(java.io.Closeable socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }

}

