/**
 * Project Name:Qbaba
 * File Name:AuthorService.java
 * Package Name:m04.d11.dao.impl
 * Date:2018年5月23日下午10:05:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d11.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * Description:   <br/>
 * Date:     2018年5月23日 下午10:05:25 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
@Component("authorService")
public class AuthorService {
    
    @Resource(name="authorImpl")
    AuthorImpl atl;
    
    public boolean addAu(){
        
       int reslut= atl.addA();
        if(reslut<0){
            return true;
        }
        return false;
    }

}

