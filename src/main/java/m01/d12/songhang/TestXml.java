/**
 * Project Name:Qbaba
 * File Name:TestXml.java
 * Package Name:m01.d12.songhang
 * Date:2018年1月12日下午10:03:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d12.songhang;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Description: <br/>
 * Date: 2018年1月12日 下午10:03:22 <br/>
 * 
 * @author songhang
 * @version
 * @see
 */
public class TestXml {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\git\\Qbaba\\src\\main\\java\\m01\\d12\\songhang\\XmlData.xml");
            DocumentBuilderFactory dif = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dif.newDocumentBuilder();
            Document dot = builder.parse(file);
            NodeList n1 = dot.getElementsByTagName("empolyees");
            for (int i = 0; i < n1.getLength(); i++) {
                Node stud = n1.item(i);
                Element element = (Element) stud;
                String str = element.getAttribute("company");
                System.out.println("排号：" + str);
                String str3 = dot.getElementsByTagName("name").item(i).getFirstChild().getNodeValue();
                String str4 = dot.getElementsByTagName("age").item(i).getFirstChild().getNodeValue();
                String str5 = dot.getElementsByTagName("color").item(i).getFirstChild().getNodeValue();
                System.out.println("宠物信息：" + str3 + " 年龄：" + str4 + " 颜色：" + str5);

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();

        } catch (SAXException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
