/**
 * Project Name:Qbaba
 * File Name:NewsTest.java
 * Package Name:m04.d12.Qbaba.junit
 * Date:2018年4月13日上午12:15:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.junit;



import java.util.List;

import m04.d12.Qbaba.entity.News;
import m04.d12.Qbaba.impl.NewsDaoImpl;



/**
 * Description:   <br/>
 * Date:     2018年4月13日 上午12:15:16 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsTest {
    
    
    public static void main(String[] args) {
        NewsDaoImpl ndi=  new NewsDaoImpl();
        List<News> lsit=ndi.selectNewsAll();
        for (News news : lsit) {
            System.out.println(news);
        }
        
    }
       
    
}

