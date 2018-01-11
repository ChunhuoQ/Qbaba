/**
 * Project Name:Qbaba
 * File Name:TcpWrite.java
 * Package Name:m01.d10.Qbaba
 * Date:2018年1月10日下午11:10:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.Qbaba;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;



/**
 * Description:   <br/>
 * Date:     2018年1月10日 下午11:10:09 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class TcpWrite {

    public static void main(String[] args) throws IOException {
       
        Socket s=new Socket("192.168.80.51",10000);
        
        
        FileInputStream fis=new FileInputStream("c:\\Pnama.mp3");
        OutputStream out=s.getOutputStream();
        byte[]buf=new byte[1024];
        int len=0 ;
        while ((len=fis.read(buf))!=-1){
            out.write(buf,0,len);
        }
        s.shutdownOutput();
        InputStream in= s.getInputStream();
        byte[] bufIn=new byte[1024];
        int lenIn=in.read(bufIn);
        String text=new String(bufIn,0,lenIn);
        System.out.println(text);
        fis.close();
        s.close();
        
    }
    
    
    
    
}

