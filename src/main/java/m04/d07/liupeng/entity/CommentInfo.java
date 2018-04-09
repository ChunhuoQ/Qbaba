/**
 * Project Name:Qbaba
 * File Name:CommentInfo.java
 * Package Name:m04.d04.liupeng.entity
 * Date:2018年4月7日下午6:41:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d07.liupeng.entity;

import java.sql.Date;

/**
 * Description:   <br/>
 * Date:     2018年4月7日 下午6:41:32 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class CommentInfo {
    private int comment_id;

    private String username;

    private String ip;

    private String content;

    private int news_id;

    private Date fbtime;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public Date getFbtime() {
        return fbtime;
    }

    public void setFbtime(Date fbtime) {
        this.fbtime = fbtime;
    }

}

