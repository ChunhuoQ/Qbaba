/**
 * Project Name:Qbaba
 * File Name:Test.java
 * Package Name:m01.d29.Qbaba
 * Date:2018年1月30日上午9:12:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d29.Qbaba;

import java.io.File;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



/**
 * Description:   <br/>
 * Date:     2018年1月30日 上午9:12:47 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Test {
    private final static Logger LOG=Logger.getLogger(Test.class);
public static void main(String[] args) {
    Test test=new Test();
    test.init();
    test.aaa();
}
    Document document=null;
    public void init(){
        SAXReader reader=new SAXReader();
        try {
           
            document=reader.read(new File("Qbaba.xml"));
        } catch (DocumentException e) {
            
            //  Auto-generated catch block
            e.printStackTrace();
            
        }
    }
    
    
    
    public void aaa(){
        init();
        Element element=document.getRootElement();
        LOG.info("节点"+element.getName());
        Iterator<Element> iter= element.elementIterator();
        while(iter.hasNext()){
            Element ele=iter.next();
            
            LOG.info(ele.getName()+":"+ele.attributeValue("name"));
          Iterator<Element> iter2=ele.elementIterator();
            while(iter2.hasNext()){
                Element ele2=iter2.next(); 
                LOG.info(ele2.getName()+":"+ele2.attributeValue("name")+":---"+ele2.getText());
            }
        }
    }
   public void addNode(){
       Element element =document.getRootElement();
       Element childelement =element.addElement("Member");
       
   }
       
       
    
    
    
}

