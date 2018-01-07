/**
 * Project Name:Qbaba
 * File Name:InOutputDemo.java
 * Package Name:m01.d06.liupeng
 * Date:2018年1月6日下午5:57:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.liupeng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月6日 下午5:57:01 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class OutputDemo {

    private final static Logger LOG = Logger.getLogger(OutputDemo.class);

    public static void main(String[] args) throws IOException {
        String path = "E:\\workspace\\ArrayN123.java";
        File file = new File(path);
        write(file);
    }

    public static void write(File file) throws IOException {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(file);
            String path = "E:\\workspace\\ArrayN.java";
            File file1 = new File(path);
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file1);
                byte[] b = new byte[1024];
                int len = fis.read(b);
                String str = null;
                while (len != -1) {
                    str = new String(b, 0, len);
                    LOG.info(str);
                    len = fis.read(b);
                    String str1 = str;
                    byte arr[] = str1.getBytes();
                    fos.write(arr);
                }
            } catch (FileNotFoundException a) {
                LOG.info("SI", a);
            } catch (IOException e) {
                LOG.info("IOE", e);
            } finally {
                if (fis != null) {
                    fis.close();
                }

            }
            fos.flush();

        } catch (FileNotFoundException a) {

        } finally {
            if (fos != null) {
                fos.close();
            }
        }
        LOG.info("拷贝完成！");
    }

}

