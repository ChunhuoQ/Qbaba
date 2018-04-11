/**
 * Project Name:Qbaba
 * File Name:Page.java
 * Package Name:m04.d09.Qbaba.entity
 * Date:2018年4月10日上午9:52:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d09.Qbaba.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月10日 上午9:52:51 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class Page {
private int currentpage;
private int pagesize=3;
private int sumsize;
private int lastpage;
/**
 * currentpage.
 *
 * @return  the currentpage
 */
public int getCurrentpage() {
    return currentpage;
}
/**
 * currentpage
 *
 * @param   currentpage    the currentpage to set
 */
public void setCurrentpage(int currentpage) {
    this.currentpage = currentpage;
}
/**
 * pagesize.
 *
 * @return  the pagesize
 */
public int getPagesize() {
    return pagesize;
}
/**
 * pagesize
 *
 * @param   pagesize    the pagesize to set
 */
public void setPagesize(int pagesize) {
    this.pagesize = pagesize;
}
/**
 * sumsize.
 *
 * @return  the sumsize
 */
public int getSumsize() {
    return sumsize;
}
/**
 * sumsize
 *
 * @param   sumsize    the sumsize to set
 */
public void setSumsize(int sumsize) {
    this.sumsize = sumsize;
}
/**
 * lastpage.
 *
 * @return  the lastpage
 */
public int getLastpage() {
    return lastpage;
}
/**
 * lastpage
 *
 * @param   lastpage    the lastpage to set
 */
public void setLastpage(int lastpage) {
    this.lastpage = lastpage;
}

    
    
    
}

