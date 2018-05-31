/**
 * Project Name:Qbaba
 * File Name:AuthorImpl.java
 * Package Name:m04.d11.dao.impl
 * Date:2018年5月22日下午5:28:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d11.dao.impl;

import org.springframework.stereotype.Component;



/**
 * Description:   <br/>
 * Date:     2018年5月22日 下午5:28:21 <br/>
 * @author   Qbaba
 * @version
 * @see
 */

//<bean id="AuthorImpl" class="m04.d11.dao.impl.AuthorImpl"></bean>
@Component("authorImpl")
public class AuthorImpl {

        public int addA(){
            System.out.println("添加成功");
            return 1;
        }
}

