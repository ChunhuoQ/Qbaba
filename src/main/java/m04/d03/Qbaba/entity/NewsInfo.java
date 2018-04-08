/**
 * Project Name:Qbaba
 * File Name:NewsInfo.java
 * Package Name:m04.d03.Qbaba.entity
 * Date:2018年4月3日下午4:58:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d03.Qbaba.entity;

/**
 * Description: <br/>
 * Date: 2018年4月3日 下午4:58:45 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class NewsInfo {
    private String news_title;

    private String news_author;

    private int news_id;
    
    private int type_id;
    
    private String news_summary;
    
    private String news_content;
    
    private String news_pic;
    /**
     * type_id.
     *
     * @return  the type_id
     */
    public int getType_id() {
        return type_id;
    }

    /**
     * type_id
     *
     * @param   type_id    the type_id to set
     */
    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    /**
     * news_summary.
     *
     * @return  the news_summary
     */
    public String getNews_summary() {
        return news_summary;
    }

    /**
     * news_summary
     *
     * @param   news_summary    the news_summary to set
     */
    public void setNews_summary(String news_summary) {
        this.news_summary = news_summary;
    }

    /**
     * news_content.
     *
     * @return  the news_content
     */
    public String getNews_content() {
        return news_content;
    }

    /**
     * news_content
     *
     * @param   news_content    the news_content to set
     */
    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    /**
     * news_pic.
     *
     * @return  the news_pic
     */
    public String getNews_pic() {
        return news_pic;
    }

    /**
     * news_pic
     *
     * @param   news_pic    the news_pic to set
     */
    public void setNews_pic(String news_pic) {
        this.news_pic = news_pic;
    }

    /**
     * news_id.
     *
     * @return  the news_id
     */
    public int getNews_id() {
        return news_id;
    }

    /**
     * news_id
     *
     * @param   news_id    the news_id to set
     */
    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    /**
     * news_title.
     *
     * @return the news_title
     */
    public String getNews_title() {
        return news_title;
    }

    /**
     * news_title
     *
     * @param news_title the news_title to set
     */
    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    /**
     * news_author.
     *
     * @return the news_author
     */
    public String getNews_author() {
        return news_author;
    }

    /**
     * news_author
     *
     * @param news_author the news_author to set
     */
    public void setNews_author(String news_author) {
        this.news_author = news_author;
    }

}
