/**
 * Project Name:Demo
 * File Name:SocketDemo.java
 * Package Name:Demo20180110
 * Date:2018年1月10日下午4:21:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.lvruiling;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午4:21:08 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class SocketDemo {

    public static void main(String[] args) {

        String path = "D:\\daima\\eclipse\\Demo20171211\\src\\Breakfast.java";
        File file = new File(path);
        int port = 8888;
        String host = "lvruiling ";
        OutputStream os = null;
        Socket socket = null;
        FileInputStream fis = null;
        try {

            InetAddress address = InetAddress.getByName(host);

            socket = new Socket(InetAddress.getByName("192.168.80.217"), 8888);
            os = socket.getOutputStream();
            fis = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = fis.read(b);
            while (len != -1) {
                os.write(b, 0, len);
                len = fis.read(b);
            }
            // os.write("HelloWorld".getBytes());
            //
            //
            os.flush();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e2) {
                    // TODO: handle exception
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e2) {
                    // TODO: handle exception
                }
            }

        }

    }

}
