package m04.d12.Qbaba.entity;

import java.util.Date;

public class News {
    private Integer nid;

    private String ntitle;

    private int allNum;
    
    private int allPage;
    
    private int nowView;
    
    /**
     * nowView.
     *
     * @return  the nowView
     */
    public int getNowView() {
        return nowView;
    }

    /**
     * nowView
     *
     * @param   nowView    the nowView to set
     */
    public void setNowView(int nowView) {
        this.nowView = nowView;
    }

    private int nowPage;
    
    private String ncontent;

    private Date ndate;
    
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
        
        if(nowPage>allPage){
            nowPage=nowPage-1;
        }else if(nowPage<=0){
            nowPage=1;
        }
        setNowView((nowPage-1)*3);
        this.nowPage = nowPage;
        
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "News [nid=" + nid + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", ndate=" + ndate + "]";
    }

    /**
     * allNum.
     *
     * @return  the allNum
     */
    public int getAllNum() {
        return allNum;
    }

    /**
     * allNum
     *
     * @param   allNum    the allNum to set
     */
    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }
}