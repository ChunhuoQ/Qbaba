/**
 * Project Name:Qbaba
 * File Name:XmlNode.java
 * Package Name:m01.d29.liupeng
 * Date:2018年1月29日下午2:09:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.liupeng;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * Description:   <br/>
 * Date:     2018年1月29日 下午2:09:48 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class XmlNode {

    private final static Logger LOG = Logger.getLogger(XmlNode.class);

    Document doc = null;
    public static void main(String[] args) {
        XmlNode xn = new XmlNode();
        xn.addNode();
    }

    public void addNode() {
        init();
        Element rootEle = doc.getRootElement();
        LOG.info("根目录元素：" + rootEle.getName());
            LOG.info("--------------------------------");
            
            //遍历xml文件节点
        Iterator<Element> iter1 = rootEle.elementIterator();
            while (iter1.hasNext()) {
                Element ele1 = iter1.next();
                LOG.info(ele1.getName() + ":" + ele1.attributeValue("name"));
                Iterator<Element> iter2 = ele1.elementIterator();
                while (iter2.hasNext()) {
                    Element ele2 = iter2.next();
                    LOG.info(ele2.getName() + ":" + ele2.attributeValue("name"));
                }
            }

        LOG.info("--------------------------------");

            // 添加节点
        Element childElement = rootEle.addElement("Brand");
        childElement.addAttribute("name", "小米");
        Element grandElement = childElement.addElement("type");
        grandElement.addAttribute("name", "红米");
        saveXML("D:\\git\\Qbaba\\src\\main\\java\\m01\\d29\\liupeng\\abc.xml");
        LOG.info("添加完成！");
        // 添加节点后再遍历
        Iterator<Element> iter3 = rootEle.elementIterator();
        while (iter3.hasNext()) {
            Element ele3 = iter3.next();
            LOG.info(ele3.getName() + ":" + ele3.attributeValue("name"));
            Iterator<Element> iter4 = ele3.elementIterator();
            while (iter4.hasNext()) {
                Element ele4 = iter4.next();
                LOG.info(ele4.getName() + ":" + ele4.attributeValue("name"));
            }
        }

        LOG.info("--------------------------------");

        // 删除节点：
        // 删除了第一个子标签
        // element.remove(element.element("Brand"));
        // 删除子标签下面子标签（type）的属性name
        rootEle.element("Brand").element("Type").remove(rootEle.element("Brand").element("Type").attribute("name"));
        saveXML("D:\\git\\Qbaba\\src\\main\\java\\m01\\d29\\liupeng\\abc.xml");
        LOG.info("删除完成！");
        Iterator<Element> iter5 = rootEle.elementIterator();
        while (iter5.hasNext()) {
            Element ele5 = iter5.next();
            LOG.info(ele5.getName() + ":" + ele5.attributeValue("name"));
            Iterator<Element> iter6 = ele5.elementIterator();
            while (iter6.hasNext()) {
                Element ele6 = iter6.next();
                LOG.info(ele6.getName() + ":" + ele6.attributeValue("name"));
            }

        }
        LOG.info("--------------------------------");
        // 修改：子标签的属性值
        Element ele = rootEle.element("Brand");
        Attribute attr = ele.attribute("name");
        attr.setValue("魅族");
        Iterator<Element> iter7 = rootEle.elementIterator();
        while (iter7.hasNext()) {
            Element ele7 = iter7.next();
            LOG.info(ele7.getName() + ":" + ele7.attributeValue("name"));
            Iterator<Element> iter8 = ele7.elementIterator();
            while (iter8.hasNext()) {
                Element ele8 = iter8.next();
                LOG.info(ele8.getName() + ":" + ele8.attributeValue("name"));
            }

        }

    }

    // 解析指定的xml文件
    public void init() {
        SAXReader reader = new SAXReader();
        try {
            // 加载并解析xml文件
            doc = reader.read(new File("D:\\git\\Qbaba\\src\\main\\java\\m01\\d29\\liupeng\\abc.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
    /**
     * 增，删，改的时候，重新保存（更新）到原始的xml文件中
     * */
    public void saveXML(String path) {
        OutputFormat opf = OutputFormat.createPrettyPrint();// 格式流文件
        // 设定格式
        opf.setEncoding("utf-8");// 需要gb2312
        XMLWriter xwrit = null;
        try {
            xwrit = new XMLWriter(new FileWriter(path), opf);
            xwrit.write(doc);// 不写上去，空的文件
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                xwrit.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

