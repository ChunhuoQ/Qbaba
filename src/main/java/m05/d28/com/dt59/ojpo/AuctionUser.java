package m05.d28.com.dt59.ojpo;

public class AuctionUser {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usercardno;

    private String usertel;

    private String useraddress;

    private String userpostnumber;

    private Short userisadmin;

    private String userquestion;

    private String useranswer;

    
    
    /**
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AuctionUser [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
                + ", usercardno=" + usercardno + ", usertel=" + usertel + ", useraddress=" + useraddress
                + ", userpostnumber=" + userpostnumber + ", userisadmin=" + userisadmin + ", userquestion="
                + userquestion + ", useranswer=" + useranswer + "]";
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsercardno() {
        return usercardno;
    }

    public void setUsercardno(String usercardno) {
        this.usercardno = usercardno == null ? null : usercardno.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserpostnumber() {
        return userpostnumber;
    }

    public void setUserpostnumber(String userpostnumber) {
        this.userpostnumber = userpostnumber == null ? null : userpostnumber.trim();
    }

    public Short getUserisadmin() {
        return userisadmin;
    }

    public void setUserisadmin(Short userisadmin) {
        this.userisadmin = userisadmin;
    }

    public String getUserquestion() {
        return userquestion;
    }

    public void setUserquestion(String userquestion) {
        this.userquestion = userquestion == null ? null : userquestion.trim();
    }

    public String getUseranswer() {
        return useranswer;
    }

    public void setUseranswer(String useranswer) {
        this.useranswer = useranswer == null ? null : useranswer.trim();
    }
}