/**
 * Project Name:Qbaba
 * File Name:DateExample.java
 * Package Name:m05.d28.com.dt59.util
 * Date:2018年5月29日下午6:06:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m05.d28.com.dt59.util;
import java.text.SimpleDateFormat; 
import java.util.Date; 
public class DateExample{ 
    SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
 
    public String DateEx(Date date){
      return bartDateFormat.format(date);
  }
}