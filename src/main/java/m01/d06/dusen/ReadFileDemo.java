/**
 * Project Name:dt59homework
 * File Name:ReadFile.java
 * Package Name:hw20180106
 * Date:2018年1月6日下午6:30:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.dusen;

import java.io.File;



import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月6日 下午6:30:00 <br/>
 * @author   DuSen
 * @version
 * @see
 */
/**
 * 5.1.编程输出指定目录中的所有文件（包括子目录中的文件）。<br/>
 * 
 */
public class ReadFileDemo {
    private final static Logger LOG = Logger.getLogger(ReadFileDemo.class);

    public static void main(String[] args) {

        String path = "D:\\WPS\\WPS Office\\10.1.0.7023\\office6";
        listDir(path);
    }

    public static void listDir(String path) {
        File file = new File(path);
        LOG.info("目录："+file.getAbsolutePath());
        String[] files = file.list();

        for (String name : files) {
            StringBuffer fullPath = new StringBuffer();// 构造一个其中不带字符的字符串缓冲区
            fullPath.append(path);// 将只当的字符串加到此字符序列
            fullPath.append(File.separator);//与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            fullPath.append(name);//
            File tmpFile = new File(fullPath.toString());
            // LOG.info(string);
            if (tmpFile.isDirectory()) {
               
                listDir(tmpFile.toString());
             
            } else {
                LOG.info("文件：" + fullPath.toString());
            }
        }
    }

}
