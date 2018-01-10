/**
 * Project Name:Qbaba
 * File Name:UpdoadClient.java
 * Package Name:m01.d10.Qbaba
 * Date:2018年1月10日下午7:45:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d10.Qbaba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description:   <br/>
 * Date:     2018年1月10日 下午7:45:48 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class UpdoadClient {

    
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s=new Socket("127.0.0.1",10005);
        BufferedReader bufr=new BufferedReader(new FileReader("F:\\QQ音乐缓存\\陈佳其 - Party是我家.mp3"));
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
        String kube =null;
        while((kube=bufr.readLine())!=null){
            out.print(kube);
        }
        
        /*out.print("voer");*/
        BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=bufIn.readLine();
        System.out.println(str);
        s.shutdownInput();
        bufr.close();
        s.close();
        
    }
    
    
}

