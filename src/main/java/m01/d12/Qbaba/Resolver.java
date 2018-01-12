/**
 * Project Name:Qbaba
 * File Name:Resolver.java
 * Package Name:m01.d12.Qbaba
 * Date:2018年1月12日下午2:46:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d12.Qbaba;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Description: <br/>
 * Date: 2018年1月12日 下午2:46:09 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class Resolver {

    public static void main(String[] args) {
        long lasting = System.currentTimeMillis();
        try {

            File f = new File("E:\\git\\Qbaba\\src\\main\\java\\m01\\d12\\Qbaba\\Qbaba的学校.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("VALUE");
            for (int i = 0; i < nl.getLength(); i++) {
                try {
                    System.out.println("\t"+doc.getElementsByTagName("name").item(i).getFirstChild().getNodeValue());
                    System.out.println("\t"+doc.getElementsByTagName("sex").item(i).getFirstChild().getNodeValue());
                    System.out.println("\t"+doc.getElementsByTagName("age").item(i).getFirstChild().getNodeValue());
                } catch (NullPointerException e) {

                }
            }

        } catch (Exception e) {

        }

        System.err.println("运行时间:" + (System.currentTimeMillis() - lasting) + "毫秒");

    }
}
