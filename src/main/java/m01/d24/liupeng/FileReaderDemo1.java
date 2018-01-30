/**
 * Project Name:Qbaba
 * File Name:FileReaderDemo1.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午8:07:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午8:07:53 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class FileReaderDemo1 {

    private final static Logger LOG = Logger.getLogger(FileReaderDemo1.class);

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr=null;
        BufferedWriter bw = null;
        FileWriter fw=null;
        try {
            fr=new FileReader("E:\\workspace\\Test\\ArrayN.java");
            br = new BufferedReader(fr);

            fw = new FileWriter("E:\\workspace\\1.java");
            bw = new BufferedWriter(fw);

            String str = br.readLine();
            while (str != null) {
                bw.write(str + "\r\n");
                str = br.readLine();
            }
            LOG.info("缓冲字符流读写完成！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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



