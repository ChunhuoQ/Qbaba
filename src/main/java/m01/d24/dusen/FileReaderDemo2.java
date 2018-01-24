/**
 * Project Name:workspace
 * File Name:FileReaderDemo2.java
 * Package Name:file
 * Date:2018年1月24日下午5:44:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.dusen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午5:44:03 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class FileReaderDemo2 {

    public static void main(String[] args) {
        FileReader fr=null;
        BufferedReader br=null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fr=new FileReader("D:\\有参无参.txt");
            br=new BufferedReader(fr);
            fw=new FileWriter("E:\\1.txt");
            bw=new BufferedWriter(fw);
            String str=br.readLine();
            while(str!=null){
                bw.write(str+"\r\n");
                str=br.readLine();
            }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }finally{
            try {
                bw.close();
                fw.close();
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

