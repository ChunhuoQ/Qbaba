/**
 * Project Name:Qbaba
 * File Name:NewsCommentInfo.java
 * Package Name:m04.d03.Qbaba.entity
 * Date:2018年4月9日下午3:32:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m04.d09.Qbaba.entity;

import java.sql.Date;

/**
 * Description:   <br/>
 * Date:     2018年4月9日 下午3:32:28 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class NewsCommentInfo {
private String comment_id;
private String username;
private int ip;
private String cotent;
private int news_id;
private Date fbtime;

/**
 * comment_id.
 *
 * @return  the comment_id
 */
public String getComment_id() {
    return comment_id;
}
/**
 * comment_id
 *
 * @param   comment_id    the comment_id to set
 */
public void setComment_id(String comment_id) {
    this.comment_id = comment_id;
}
/**
 * username.
 *
 * @return  the username
 */
public String getUsername() {
    return username;
}
/**
 * username
 *
 * @param   username    the username to set
 */
public void setUsername(String username) {
    this.username = username;
}
/**
 * ip.
 *
 * @return  the ip
 */
public int getIp() {
    return ip;
}
/**
 * ip
 *
 * @param   ip    the ip to set
 */
public void setIp(int ip) {
    this.ip = ip;
}
/**
 * cotent.
 *
 * @return  the cotent
 */
public String getCotent() {
    return cotent;
}
/**
 * cotent
 *
 * @param   cotent    the cotent to set
 */
public void setCotent(String cotent) {
    this.cotent = cotent;
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
 * fbtime.
 *
 * @return  the fbtime
 */
public Date getFbtime() {
    return fbtime;
}
/**
 * fbtime
 *
 * @param   fbtime    the fbtime to set
 */
public void setFbtime(Date fbtime) {
    this.fbtime = fbtime;
}
}

