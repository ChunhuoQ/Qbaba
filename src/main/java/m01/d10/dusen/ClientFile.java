/**
 * Project Name:dt59homework
 * File Name:ClientFile.java
 * Package Name:hw20180110
 * Date:2018年1月10日下午9:28:24
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.dusen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午9:28:24 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class ClientFile {

    public static void main(String[] args) {
        System.out.println("开始传输。。");
        String path = "D:\\1234.avi"; // 写入路径
        String host = "192.168.80.210";
        File file = new File(path); // 将指定路径字符串转换为抽象路径来创建一个file实例
        int port = 10000; // 给一个端口号
        OutputStream os = null;// 输出流接收输出字节并将这些字节发送到某个接收器
        Socket socket = null;// 创建未连接套接字
        FileInputStream fis = null;// 通过打开一个到实际文件的连接来创建一个FileInputStream,该文件通过文件系统中的File对象file指
                                   // 定
        try {
            socket = new Socket("192.168.191.1", port);// 创建一个流套接字并将其连接到指定的主机上的指定端口

            os = socket.getOutputStream();// 返回此套接字的输出流。

            fis = new FileInputStream(file);// 该文件通过文件系统中的路径名name指定
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                os.write(b, 0, len);
            }
            os.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fis != null) {
                try {
                    fis.close();
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
