/**
 * Project Name:Qbaba
 * File Name:FileDirDemo.java
 * Package Name:m01.d06
 * Date:2018年1月6日下午1:59:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.liupeng;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月6日 下午1:59:09 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class FileDirDemo {

    private final static Logger LOG = Logger.getLogger(FileDirDemo.class);

    public static void main(String[] args) {
        String path = "D:\\Java\\jdk1.7.0_07";

        File file = new File(path);
        String[] files = file.list();
        LOG.info(file.getName());
        LOG.info(file.getPath());

        LOG.info("******************************************");
        for (String name : files) {
            StringBuffer fullFile = new StringBuffer();
            fullFile.append(file.getPath());
            fullFile.append(file.separator);
            fullFile.append(name);
            File tmpFile = new File(fullFile.toString());
            if (tmpFile.isDirectory()) {
                LOG.info("目录：" + tmpFile);
                File fileZi = new File(fullFile.toString());
                String[] fileZis = fileZi.list();
                for (String names : fileZis) {
                    StringBuffer fullFileZi = new StringBuffer();
                    fullFileZi.append(fileZi.getPath());
                    fullFileZi.append(fileZi.separator);
                    fullFileZi.append(names);
                    File tmpFileZi = new File(fullFileZi.toString());
                    if (tmpFileZi.isDirectory()) {
                        LOG.info("-------" + "目录：" + tmpFileZi);
                    } else {
                        LOG.info("-------" + "文件：" + tmpFileZi);
                    }

                }

            } else {
                LOG.info("文件：" + tmpFile);
            }

        }

    }

}

