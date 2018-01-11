/**
 * Project Name:Test201801
 * File Name:SocketDemo.java
 * Package Name:test0110
 * Date:2018年1月10日下午4:20:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.liupeng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午4:20:16 <br/>
 * 
 * @author LiuPeng
 * @version
 * @see
 */
public class ClientFileTransfer {

    public static void main(String[] args) {
        String path = "E:\\Jave编程学习\\黑马\\aaaa\\day01\\视频\\3.xml语法.avi";
        File file = new File(path);
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            socket = new Socket(InetAddress.getByName("192.168.80.25"), 9090);
            os = socket.getOutputStream();
            fis = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = fis.read(b);
            while (len != -1) {
                os.write(b, 0, len);
                len = fis.read(b);
            }
            os.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }

}

