/**
 * Project Name:Qbaba
 * File Name:CopyDemo.java
 * Package Name:m01.d06.lvruiling
 * Date:2018年1月7日上午10:56:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.lvruiling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午10:56:43 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class CopyDemo {
    private final static Logger LOG = Logger.getLogger(CopyDemo.class);

    public static void main(String[] args) throws IOException {

        String path = "D:\\daima\\eclipse\\Demo20171211\\src\\Breakfast.java";
        String path1 = "D:\\ccc\\copydemo.java";
        File file = new File(path);
        File file1 = new File(path1);
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file1);
        fis.read();
        int temp = 0;
        while ((temp = fis.read()) != -1) {
            fos.write(temp);
        }
        fis.close();
        fos.close();

    }
}
