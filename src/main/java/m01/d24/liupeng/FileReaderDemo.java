/**
 * Project Name:Qbaba
 * File Name:FileReaderDemo.java
 * Package Name:m01.d24.liupeng
 * Date:2018年1月24日下午7:30:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d24.liupeng;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月24日 下午7:30:07 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class FileReaderDemo {

    private final static Logger LOG = Logger.getLogger(FileReaderDemo.class);

    public static void main(String[] args) {

        FileReader fr=null;
        try {
            fr=new FileReader("E:\\workspace\\Test\\ArrayN.java");
            char[] buf = new char[1024];
            int len = 0;
            while ((fr.read(buf)) != -1) {
                LOG.info(new String(buf, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

