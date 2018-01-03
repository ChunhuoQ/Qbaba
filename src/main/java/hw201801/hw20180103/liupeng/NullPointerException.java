/**
 * Project Name:dt59-liupeng
 * File Name:NullPointerException.java
 * Package Name:hw201801.hw20180103
 * Date:2018年1月3日下午2:45:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw201801.hw20180103.liupeng;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:45:36 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/**
 * 作业3．编写一个空指针异常代码，并用try..catch处理<br/>
 * Description: <br/>
 * date: 2018年1月3日 下午3:25:55 <br/>
 *
 * @author LiuPeng
 * @version
 */
public class NullPointerException {
    public void nullPointer(String i) {
        String j = null;
        LOG.info(j);
    }
    public final static Logger LOG = Logger.getLogger(NullPointerException.class);

    public static void main(String[] args) {

        try {
            NullPointerException nullPointerException = new NullPointerException();
            nullPointerException.nullPointer(null);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

