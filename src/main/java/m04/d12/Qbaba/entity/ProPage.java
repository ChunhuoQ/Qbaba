/**
 * Project Name:Qbaba
 * File Name:ProPage.java
 * Package Name:m04.d12.Qbaba.entity
 * Date:2018年4月15日上午12:06:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d12.Qbaba.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月15日 上午12:06:09 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class ProPage {
    private int allPage;
    
    private int nowPage;
    
    private int starPage;

    private int lastPage;
    
    
    /**
     * lastPage.
     *
     * @return  the lastPage
     */
    public int getLastPage() {
        return lastPage;
    }

    /**
     * lastPage
     *
     * @param   lastPage    the lastPage to set
     */
    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    /**
     * allPage.
     *
     * @return  the allPage
     */
    public int getAllPage() {
        return allPage;
    }

    /**
     * allPage
     *
     * @param   allPage    the allPage to set
     */
    public void setAllPage(int allPage) {
        this.allPage = allPage;
    }

    /**
     * nowPage.
     *
     * @return  the nowPage
     */
    public int getNowPage() {
        return nowPage;
    }

    /**
     * nowPage
     *
     * @param   nowPage    the nowPage to set
     */
    public void setNowPage(int nowPage) {
        
        if(nowPage>lastPage){
            nowPage=lastPage;
        }else if(nowPage<=0){
            nowPage=1;
        }
        setStarPage((nowPage-1)*3);
        
        this.nowPage = nowPage;
    }

    /**
     * starPage.
     *
     * @return  the starPage
     */
    public int getStarPage() {
        return starPage;
    }

    /**
     * starPage
     *
     * @param   starPage    the starPage to set
     */
    public void setStarPage(int starPage) {
        this.starPage = starPage;
    }
    
    
    
}

