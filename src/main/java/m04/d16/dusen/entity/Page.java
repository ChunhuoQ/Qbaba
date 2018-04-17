/**
 * Project Name:xinwen2
 * File Name:Page.java
 * Package Name:com.xin.entity
 * Date:2018年4月10日上午9:52:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d16.dusen.entity;

/**
 * Description: <br/>
 * Date: 2018年4月10日 上午9:52:18 <br/>
 * 
 * @author lenovopc
 * @version
 * @see
 */
public class Page {
    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
//        if (currentpage < 1) {
//          this.currentpage = 1;
//     }else {
            this.currentpage = currentpage;
//      }
//      if(currentpage>=this.pagesize){
//          this.currentpage=this.pagesize;
//        }
 
   }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getSumsize() {
        return sumsize;
    }

    public void setSumsize(int sumsize) {
        this.sumsize = sumsize;
    }

    public int getLastpage() {
        return lastpage;
    }

    public void setLastpage(int lastpage) {
        
            if (lastpage % this.pagesize == 0) {
                this.lastpage = lastpage / this.pagesize;
            } else {
                this.lastpage = lastpage / this.pagesize + 1;
            }
    }

    private int currentpage;// 当前页

    private int pagesize = 3;// 每页显示

    private int sumsize;// 总条数

    private int lastpage;// 尾页

}
