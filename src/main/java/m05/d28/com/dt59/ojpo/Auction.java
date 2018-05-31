package m05.d28.com.dt59.ojpo;

public class Auction {
    
    private Integer auctionid;

    private String auctionname;

    private Double auctionstartprice;

    private Double auctionupset;

    private String auctionstarttime;

    private String auctionendtime;

    private String auctionpictype;

    private String auctiondesc;

    private Object auctionpic;
 
    public Auction(Integer auctionid, String auctionname, Double auctionstartprice, Double auctionupset,
            String auctionstarttime, String auctionendtime, String auctionpictype, String auctiondesc, byte[] auctionpic) {
        super();
        this.auctionid = auctionid;
        this.auctionname = auctionname;
        this.auctionstartprice = auctionstartprice;
        this.auctionupset = auctionupset;
        this.auctionstarttime = auctionstarttime;
        this.auctionendtime = auctionendtime;
        this.auctionpictype = auctionpictype;
        this.auctiondesc = auctiondesc;
        this.auctionpic = auctionpic;
    }


    public Auction() {
        
        super();
        //  Auto-generated constructor stub
        
    }


    /**
     *
     * @see java.lang.Object#toString()
     */


    public Integer getAuctionid() {
        return auctionid;
    }

    
    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public String getAuctionname() {
        return auctionname;
    }

    public void setAuctionname(String auctionname) {
        this.auctionname = auctionname == null ? null : auctionname.trim();
    }

    public Double getAuctionstartprice() {
        return auctionstartprice;
    }

    public void setAuctionstartprice(Double auctionstartprice) {
        this.auctionstartprice = auctionstartprice;
    }

    public Double getAuctionupset() {
        return auctionupset;
    }

    public void setAuctionupset(Double auctionupset) {
        this.auctionupset = auctionupset;
    }

    public String getAuctionstarttime() {
        return auctionstarttime;
    }

    public void setAuctionstarttime(String auctionstarttime) {
        this.auctionstarttime = auctionstarttime;
    }

    public String getAuctionendtime() {
        return auctionendtime;
    }

    public void setAuctionendtime(String auctionendtime) {
        this.auctionendtime = auctionendtime;
    }

    public String getAuctionpictype() {
        return auctionpictype;
    }

    public void setAuctionpictype(String auctionpictype) {
        this.auctionpictype = auctionpictype == null ? null : auctionpictype.trim();
    }

    public String getAuctiondesc() {
        return auctiondesc;
    }

    public void setAuctiondesc(String auctiondesc) {
        this.auctiondesc = auctiondesc == null ? null : auctiondesc.trim();
    }

    public Object getAuctionpic() {
        return auctionpic;
    }

    public void setAuctionpic(Object auctionpic) {
        this.auctionpic = auctionpic;
    }
}