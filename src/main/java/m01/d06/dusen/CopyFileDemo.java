/**
 * Project Name:dt59homework
 * File Name:CopyFileDemo.java
 * Package Name:hw20180106
 * Date:2018年1月7日上午10:26:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.dusen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午10:26:13 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class CopyFileDemo {

    private final static Logger LOG = Logger.getLogger(CopyFileDemo.class);

    public static void main(String[] args) throws IOException {

        // InputStream is=null;
        // OutputStream os= null;
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("E:\\棒槌.txt");
            fw = new FileWriter("E:\\棒槌1.txt");
            char[] b = new char[1024];
            int len = 0;
            while ((len = fr.read(b)) != -1) {
                
                fw.write(b, 0, len);;
            }
            LOG.info("复制成功");
            // is=new FileInputStream("E:\\棒槌.txt");
            // os=new FileOutputStream("E:\\棒槌1.txt");
            // int len=0;
            // while((len=is.read())!=-1){
            // os.write(len);
            // }
            // LOG.info("复制成功");
        } catch (FileNotFoundException e) {
            LOG.info("读取失败");
            e.fillInStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // if(is!=null){
            // is.close();
            // }if(os!=null){
            // os.close();
            // }
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }

    }
}
