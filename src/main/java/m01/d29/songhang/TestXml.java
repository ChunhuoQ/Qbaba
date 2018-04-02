/**
 * Project Name:Qbaba
 * File Name:TestXml.java
 * Package Name:m01.d29.songhang
 * Date:2018年1月29日下午5:39:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.songhang;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * Description: <br/>
 * Date: 2018年1月29日 下午5:39:49 <br/>
 * 
 * @author songhang
 * @version 测试xml 访问节点 增加节点 改变节点 删除节点
 * @see
 */
public class TestXml {

    public static void main(String[] args) {
        TestXml tt = new TestXml();
        // tt.atv();
        tt.init();
        tt.addNode();

    }

    Document document = null;

    public void init() {
        SAXReader reader = new SAXReader();
        // 加载abc.xml 解析
        try {
            document = reader.read(new File("abc.xml"));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    /**
     * @see 访问abc.xml 爬树的方式解析 查询
     */
    @SuppressWarnings("unchecked")
    public void atv() {
        init();
        Element cc = document.getRootElement();// 先获取根目录
        System.out.println("元素:" + cc.getName());
        // 如何遍历出子节点的元素？
        System.out.println(".......................");
        Iterator<Element> ite = cc.elementIterator();// 迭代器
        while (ite.hasNext()) {
            Element ele = ite.next();
            System.out.println(ele.getName() + ":" + ele.attributeValue("name"));
            Iterator<Element> ite1 = ele.elementIterator();
            while (ite1.hasNext()) {
                Element ele1 = ite1.next();
                System.out.println(ele1.getName() + ":" + ele1.attributeValue("name"));
            }
        }
    }

    @SuppressWarnings("unused")
    public void addNode() {// 添加元素
        try {
            Element ct = document.getRootElement();
            Element childElement = ct.addElement("Brand");
            childElement.addAttribute("name", "小米");
            saveXML("abc.xml");
            System.out.println("添加完成");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public void dleNode() {
        Element cb = document.getRootElement();
        String str = cb.getName();

        saveXML("abc.xml");
        System.out.println("移除完成");
    }

    private void saveXML(String path) {
        OutputFormat opf = OutputFormat.createCompactFormat();
        opf.setEncoding("utf-8");
        XMLWriter xmlrit = null;
        try {
            xmlrit = new XMLWriter(new FileWriter(path), opf);
            xmlrit.write(document);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                xmlrit.close();
            } catch (IOException e) {

                // Auto-generated catch block
                e.printStackTrace();

            }

        }

    }
}
