/**
 * Project Name:Qbaba
 * File Name:TcpSend.java
 * Package Name:m01.d10.Qbaba
 * Date:2018年1月10日下午11:09:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.Qbaba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA_2_3.portable.OutputStream;

/**
 * Description:   <br/>
 * Date:     2018年1月10日 下午11:09:37 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TcpSend {
    
    public static void main(String[] args) throws IOException {
                
        @SuppressWarnings("resource")
        ServerSocket ss= new ServerSocket(1005);
        Socket s =ss.accept();
        String ip =s.getInetAddress().getHostAddress();
        InputStream in =s.getInputStream();
        File dir =new File("c:\\Pnama.mp3");
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file =new File(dir,ip+".bmp");
        FileOutputStream fos=new FileOutputStream(file);
        byte [] buf=new byte[1024];
        int len=0;
        while ((len=in.read(buf))!=-1){
            fos.write(buf,0,len);
            
        }
        
        OutputStream out=(OutputStream) s.getOutputStream();
        out.write("上传成功".getBytes());
        fos.close();
        s.close();
    }
    
    

}

