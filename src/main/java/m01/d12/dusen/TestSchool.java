/**
 * Project Name:workspace
 * File Name:TestSchool.java
 * Package Name:xmldemo
 * Date:2018年1月12日下午3:46:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d12.dusen;

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
 * Date: 2018年1月12日 下午3:46:46 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class TestSchool {

    public static void main(String[] args) {
        try {
            File f = new File("D:\\workspace\\workspace\\work\\xmldemo\\School.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("student");
            for (int i = 0; i < nl.getLength(); i++) {
                Node stud = nl.item(i);
                Element element = (Element) stud;
                String str = element.getAttribute("id");
                System.out.println("学号：" + str);
                String str3 = doc.getElementsByTagName("name").item(i).getFirstChild().getNodeValue();
                String str4 = doc.getElementsByTagName("age").item(i).getFirstChild().getNodeValue();
                String str5 = doc.getElementsByTagName("sex").item(i).getFirstChild().getNodeValue();
                System.out.println("学生信息：" + str3 + " 年龄：" + str4 + " 性别：" + str5);

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();

        } catch (SAXException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }
    }

}
