/**
 * Project Name:NewsSystem1.1
 * File Name:NewsInfo.java
 * Package Name:com.liupeng.entity
 * Date:2018年4月7日下午2:53:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d10.liupeng.entity;
/**
 * Description:   <br/>
 * Date:     2018年4月7日 下午2:53:37 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class NewsInfo {
    private int news_id;

    private int type_id;

    private String news_title;

    private String news_author;

    private String news_summary;

    private String news_content;

    private String news_pic;

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_author() {
        return news_author;
    }

    public void setNews_author(String news_author) {
        this.news_author = news_author;
    }

    public String getNews_summary() {
        return news_summary;
    }

    public void setNews_summary(String news_summary) {
        this.news_summary = news_summary;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public String getNews_pic() {
        return news_pic;
    }

    public void setNews_pic(String news_pic) {
        this.news_pic = news_pic;
    }

}

