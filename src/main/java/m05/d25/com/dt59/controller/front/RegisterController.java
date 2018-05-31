/**
 * Project Name:Qbaba
 * File Name:RegisterServlet.java
 * Package Name:m05.d25.com.dt59.servlet.front
 * Date:2018年5月25日下午10:31:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d25.com.dt59.controller.front;

import m05.d25.com.dt59.opjo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:   <br/>
 * Date:     2018年5月25日 下午10:31:36 <br/>
 * @author   Qbaba
 * @version
 * @see
 */

@Controller
public class RegisterController {
    
    @RequestMapping(value="/reg")
    public String reg(User user){
        System.out.println(user);
        return "register.jsp";
    }
}

