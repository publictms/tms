package be.pxl.publictms.pojo;
// Generated 19-dec-2013 20:16:01 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Bericht generated by hbm2java
 */
public class Bericht  implements java.io.Serializable {


     private int berichtid;
     private int gebruikerid;
     private int ontvangerid;
     private String berichttitel;
     private String bericht;
     private Date datum;
     private Boolean gelezen;

    public Bericht() {
    }

	
    public Bericht(int berichtid, int gebruikerid , int ontvangerid, String bericht) {
        this.berichtid = berichtid;
        this.gebruikerid  = gebruikerid ;
        this.ontvangerid = ontvangerid;
        this.bericht = bericht;
    }
    public Bericht(int berichtid, int gebruikerid , int ontvangerid, String berichttitel, String bericht, Date datum, Boolean gelezen) {
       this.berichtid = berichtid;
       this.gebruikerid  = gebruikerid ;
       this.ontvangerid = ontvangerid;
       this.berichttitel = berichttitel;
       this.bericht = bericht;
       this.datum = datum;
       this.gelezen = gelezen;
    }
   
    public int getBerichtid() {
        return this.berichtid;
    }
    
    public void setBerichtid(int berichtid) {
        this.berichtid = berichtid;
    }

    public int getGebruikerid() {
        return gebruikerid;
    }

    public void setGebruikerid(int gebruikerid) {
        this.gebruikerid = gebruikerid;
    }

    public int getontvangerid() {
        return ontvangerid;
    }

    public void setontvangerid(int ontvangerid) {
        this.ontvangerid = ontvangerid;
    }
   
    public String getBerichttitel() {
        return this.berichttitel;
    }
    
    public void setBerichttitel(String berichttitel) {
        this.berichttitel = berichttitel;
    }
    public String getBericht() {
        return this.bericht;
    }
    
    public void setBericht(String bericht) {
        this.bericht = bericht;
    }
    public Date getDatum() {
        return this.datum;
    }
    
    public void setDatum(Date datum) {
        this.datum = datum;
    }
    public Boolean getGelezen() {
        return this.gelezen;
    }
    
    public void setGelezen(Boolean gelezen) {
        this.gelezen = gelezen;
    }




}


