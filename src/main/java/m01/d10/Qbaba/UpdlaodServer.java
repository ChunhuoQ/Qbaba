/**
 * Project Name:Qbaba
 * File Name:UpdlaodClient.java
 * Package Name:m01.d10.Qbaba
 * Date:2018年1月10日下午7:53:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.Qbaba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:   <br/>
 * Date:     2018年1月10日 下午7:53:43 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class UpdlaodServer {
public static void main(String[] args) throws IOException {
    ServerSocket ss=new ServerSocket(10005);
   
    Socket s =ss.accept(); 
    System.out.println(s.getInetAddress().getHostAddress()+"...connected");
    BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedWriter bufw= new BufferedWriter(new FileWriter("c:\\大姑姑.mp3"));

    String line=null;
   
    while((line=bufIn.readLine())!=null){
        if("over".equals(line))break;
        
        bufw.write(line);
        bufw.newLine();
        bufw.flush();
        
    }
    PrintWriter out=new PrintWriter(s.getOutputStream());
    out.print("上传成功！");
    bufw.close();
    s.close();
    ss.close();
    

}
    
}

