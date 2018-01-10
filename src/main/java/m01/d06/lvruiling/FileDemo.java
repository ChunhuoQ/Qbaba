/**
 * Project Name:Qbaba
 * File Name:FileDemo.java
 * Package Name:m01.d06.lvruiling
 * Date:2018年1月6日下午2:00:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.lvruiling;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午2:00:14 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class FileDemo {
    private final static Logger LOG = Logger.getLogger(FileDemo.class);

    public void listdir() {
        String path = "D:/eclipse/Demo/src";
        File file = new File(path);
        String[] files = file.list();
        for (String name : files) {
            StringBuffer fullpath = new StringBuffer();
            fullpath.append(path);

            fullpath.append(file.separator);
            fullpath.append(name);
            File tmpFile = new File(fullpath.toString());
            if (tmpFile.isDirectory()) {
                File[] f = tmpFile.listFiles();
                // LOG.info("目录有：" + tmpFile);
                for (File ff : f) {
                    LOG.info(ff);// 在f里面的所有文件（包括文件夹 和 文件）
                }
                // StringBuffer fullpath1 = new StringBuffer();
                //
                // fullpath.append(file.separator);
                // fullpath.append(path);
                //
                // // fullpath.append(name);
                // File tmpFile1 = new File(fullpath.toString());
                // if (tmpFile.isAbsolute()) {
                // LOG.info("子级文件有：" + fullpath.toString());
                // }
                // }
            } else {
                LOG.info("文件有：" + tmpFile);
            }
        }

    }

    public static void main(String[] args) {
        FileDemo fd = new FileDemo();
        fd.listdir();

    }
}