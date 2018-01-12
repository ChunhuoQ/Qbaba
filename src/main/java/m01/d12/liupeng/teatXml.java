/**
 * Project Name:Qbaba
 * File Name:teatXml.java
 * Package Name:m01.d12.liupeng
 * Date:2018年1月12日下午2:04:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d12.liupeng;

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
 * Description:   <br/>
 * Date:     2018年1月12日 下午2:04:43 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class teatXml {
    public static void main(String[] args) {
        File file = new File("D:\\git\\Qbaba\\src\\main\\java\\m01\\d12\\liupeng\\school.xml");
        DocumentBuilderFactory documentBuilder = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = documentBuilder.newDocumentBuilder();
            Document doc = builder.parse(file);
            NodeList classList0 = doc.getElementsByTagName("school");
            Node schoolNode = classList0.item(0);
            Element element0 = (Element) schoolNode;
            String attrvalue0 = element0.getAttribute("name");
            System.out.println(attrvalue0);
            NodeList classList = doc.getElementsByTagName("class");
            for (int i = 0; i < (classList.getLength()); i++) {
                Node classNode = classList.item(i);
                Element element = (Element) classNode;
                String attrvalue = element.getAttribute("name");
                System.out.println("|--" + attrvalue);

                NodeList childList = element.getElementsByTagName("student");
                for (int j = 0; j < childList.getLength(); j++) {
                    Node elementNode = childList.item(j);
                    Node textNode = elementNode.getFirstChild();
                    String student = textNode.getNodeValue();
                    System.out.println("|--|--" + student);
                }

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

