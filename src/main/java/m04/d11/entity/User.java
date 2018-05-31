package m04.d11.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    private Integer newsId;

    private Integer typeId;

    private String newsTitle;

    private String newsAuthor;

    private String newsSummary;

    private String newsContent;

    private String newsPic;

    private Role role;

    private List<Role> lists;

    private Set sets;

    private Map<String, Object> maps;

    private Properties props;
    
    
    
    /**
     * props.
     *
     * @return  the props
     */
    public Properties getProps() {
        return props;
    }

    /**
     * props
     *
     * @param   props    the props to set
     */
    public void setProps(Properties props) {
        this.props = props;
    }

    /**
     * maps.
     *
     * @return  the maps
     */
    public Map<String, Object> getMaps() {
        return maps;
    }

    /**
     * maps
     *
     * @param   maps    the maps to set
     */
    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    /**
     * lists.
     *
     * @return the lists
     */
    public List<Role> getLists() {
        return lists;
    }

    /**
     * lists
     *
     * @param lists the lists to set
     */
    public void setLists(List<Role> lists) {
        this.lists = lists;
    }

    /**
     * sets.
     *
     * @return the sets
     */
    public Set getSets() {
        return sets;
    }

    /**
     * sets
     *
     * @param sets the sets to set
     */
    public void setSets(Set sets) {
        this.sets = sets;
    }

    /**
     * lists.
     *
     * @return the lists
     */
    public List<Role> getlists() {
        return lists;
    }

    /**
     * lists
     *
     * @param lists the lists to set
     */
    public void setlists(List<Role> lists) {
        this.lists = lists;
    }

    

    

    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [newsId=" + newsId + ", typeId=" + typeId + ", newsTitle=" + newsTitle + ", newsAuthor="
                + newsAuthor + ", newsSummary=" + newsSummary + ", newsContent=" + newsContent + ", newsPic=" + newsPic
                + ", role=" + role + ", lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", props=" + props
                + "]";
    }

    /**
     * role.
     *
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * role
     *
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    public User() {
        System.out.println("链接成功");
    }

    public void gogo() {
        System.out.println("爸爸的爸爸叫爷爷");
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    public String getNewsSummary() {
        return newsSummary;
    }

    public void setNewsSummary(String newsSummary) {
        this.newsSummary = newsSummary == null ? null : newsSummary.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNewsPic() {
        return newsPic;
    }

    public void setNewsPic(String newsPic) {
        this.newsPic = newsPic == null ? null : newsPic.trim();
    }
}