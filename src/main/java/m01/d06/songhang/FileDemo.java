/**
 * Project Name:Qbaba
 * File Name:FileDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午12:45:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.songhang;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:45:16 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class FileDemo {
    private final static Logger LOG = Logger.getLogger(FileDemo.class);

    public static void main(String[] args) {
        FileDemo fd = new FileDemo();// 创建一个fd对象

        try {// 在try下面范围内
            fd.listDir();
            // FileDemo.listDir2();
        } catch (NullPointerException e) {// 捕捉一个空指针异常并抛出
            LOG.info("出现错误");
            e.printStackTrace();

        }

    }

    public static void fileInfo() {
        String path1 = "D:\\git\\songhang724";
        // String path2 = "D:/git/songhang724/.git";

        File file = new File(path1);

        if (file.exists()) {// 测试文件或目录是否存在
            String name = file.getName();// 获取文件的名字
            String path = file.getPath();// 获取文件的路径
            LOG.info("file.name:" + name);
            LOG.info("file.path:" + path);
            if (file.isFile()) {// 判断文件是否是一个标准的文件
                LOG.info("指定的路径指向一个文件");
            } else {
                LOG.info("指定的路径指向一个目录");
            }
        } else {
            LOG.info("指定路径的文件不存在");
        }
    }

    public void listDir() {
        String path = "D:\\git\\songhang724";
        File file = new File(path);
        String[] file1 = file.list();
        LOG.info(file1.length);// 输出文件的长度

        for (String name : file1) {
            StringBuffer fullPath = new StringBuffer();
            fullPath.append(path);// 追加path到此系列中
            fullPath.append(File.separator);// 分隔符
            fullPath.append(name);// 追加name到此系列中
            File tmpFile = new File(fullPath.toString()/* 返回此序列中数据的字符串表示形式 */);// new
                                                                               // 一个对象
            if (tmpFile.isDirectory()/* 测试指定的文件是否是一个目录 */) {
                LOG.info("指定的路径指向一个目录" + tmpFile + "\n");
                File fiel = new File(fullPath.toString());
                String[] file2 = fiel.list();
                for (String name1 : file2) {
                    StringBuffer fullPath1 = new StringBuffer();
                    fullPath1.append(tmpFile);// 追加path到此系列中
                    fullPath1.append(File.separator);// 分隔符
                    fullPath1.append(name1);// 追加name1到此系列中
                    File tmpFile1 = new File(fullPath1.toString()/* 返回此序列中数据的字符串表示形式 */);// new
                                                                                         // 一个对象
                    if (tmpFile.isDirectory()/* 测试指定的文件是否是一个目录 */) {
                        LOG.info("指定的路径指向一个目录" + tmpFile1);

                        ;
                    } else {
                        LOG.info("指定的路径指向一个文件" + tmpFile1);
                    }
                }

            } else {
                LOG.info("指定的路径指向一个文件" + tmpFile);
            }

        }

    }
}
