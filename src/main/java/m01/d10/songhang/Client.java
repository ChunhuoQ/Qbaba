/**
 * Project Name:Qbaba
 * File Name:Client.java
 * Package Name:m01.d10.songhang
 * Date:2018年1月10日下午6:26:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.songhang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午6:26:09 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class Client {

    public static void main(String[] args) {
        String path = "D:\\git\\songhang724\\new.txt";
        File file = new File(path);
        OutputStream os = null;
        Socket socket = null;
        FileInputStream fis = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 6666);
            os = socket.getOutputStream();
            fis = new FileInputStream(file);

            byte[] b = new byte[1024];
            int len = fis.read();
            while (len != -1) {
                String str = new String(b, 0, len);
                len = fis.read(b);
                os.write(str.getBytes());
            }
            os.flush();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();

                        }
                    }
                }
            }
        }
    }

}
