/**
 * Project Name:Demo
 * File Name:DemoXml.java
 * Package Name:Demo20180112
 * Date:2018年1月12日下午12:00:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d12.lvruiling;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

/**
 * Description: <br/>
 * Date: 2018年1月12日 下午12:00:18 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class DemoXml {

    public static void main(String[] args) {

        try {
            File f = new File("D:\\git\\Qbaba\\src\\main\\java\\m01\\d12\\lvruiling\\School.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("name");
            for (int i = 0; i < nl.getLength(); i++) {

                NodeList childList = doc.getElementsByTagName("sex");
                org.w3c.dom.Node elementNode = childList.item(i);
                String eValue = elementNode.getNodeValue();
                System.out.println("姓名：" + eValue);
                org.w3c.dom.Node textNode = elementNode.getFirstChild();
                String se = textNode.getNodeValue();
                System.out.println("性别：" + se);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
