/**
 * Project Name:Qbaba
 * File Name:CopyDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午12:47:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.songhang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午12:47:35 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class CopyDemo {
    private final static Logger LOG = Logger.getLogger(CopyDemo.class);

    public static void main(String[] args) throws IOException {
        String path = "D:\\git\\songhang724\\new.txt";// 声明一个路径的属性并赋值
        String path1 = "D:\\git\\songhang724\\new1.txt";// 声明一个路径的属性并赋值
        FileInputStream fos = new FileInputStream(path);// 创建一个对象并初始化
        FileOutputStream fis = new FileOutputStream(path1);
        byte[] b = new byte[24];// 定义一个byte数组
        int len = fos.read(b);// 通过fis工具从file中，读取byte数据到b数组中
        String str = new String(b, 0, len);// b,字节数组；offset：开始读的位置 len：24
                                           // 从开始位置后数24个字节
        LOG.info(str);
        if (fos.read(b) == -1) {
            fis.write(b);
        }
        fos.close();
        fis.close();
        LOG.info("复制完成");
    }
}
