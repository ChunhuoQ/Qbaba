/**
 * Project Name:Qbaba
 * File Name:CopyOut.java
 * Package Name:m01.d06.Qbaba
 * Date:2018年1月6日下午7:29:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.Qbaba;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午7:29:39 <br/>
 * 
 * @author Qbaba
 * @version
 * @se 第二题+第三题;
 */
public class CopyOut {
    private final static Logger LOG = Logger.getLogger(CopyOut.class);

    public static void nowDatetwo() {// 第1种效果

        SimpleDateFormat SDF = new SimpleDateFormat("zzzz： hh 'o''clock' a ");

        long cur = System.currentTimeMillis();

        Date date = new Date(cur);
        String nowDate = SDF.format(date);
        System.out.println(nowDate);
    }

    public static void nowDate() {// 第2种效果

        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/ddEEEE\tHH:mm");

        long cur = System.currentTimeMillis();

        Date date = new Date(cur);
        String nowDate = SDF.format(date);
        System.out.println(nowDate);
    }

    // 方法- 缓冲区 推到硬盘
    public static void copy_2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\黑崎子 - Panama.mp3");
        FileOutputStream fos = new FileOutputStream("D:\\你大哥家乡有四百斤鸭吗.mp3");
        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        fos.write(buf);

        LOG.info("\n黑崎子 - Panama.mp3 文件-复制成功！");
        nowDatetwo();// 第三题    第一种模板
        nowDate();//          模板二（改造后）
        fis.close();
        fos.close();

    }

    // 方法二 文本内容粘贴
    public static void copy_1() throws IOException {
        FileReader fr = new FileReader("D:\\IOcope.txt");

        FileWriter fw = new FileWriter("D:\\粘贴到这里.java");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        LOG.info("\nIOcope.txt -文件-复制成功");
        fw.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        copy_1();
        copy_2();

    }

}
