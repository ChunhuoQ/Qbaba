/**
 * Project Name:dt59homework
 * File Name:Four.java
 * Package Name:hw20180103.one
 * Date:2018年1月3日下午3:39:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d03.songhang;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:39:32 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Four {
    private final static Logger LOG = Logger.getLogger(Four.class);

    @SuppressWarnings("null")
    public static void main(String[] args) {

        String str = null;
        try {
            if (str.equals("test")) {

            }

        } catch (Exception e) {
            LOG.info("输出异常");
            e.printStackTrace();
        }
    }
}
