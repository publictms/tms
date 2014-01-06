package be.pxl.publictms.pojo;
// Generated 19-dec-2013 20:16:01 by Hibernate Tools 3.2.1.GA

/**
 * Contact generated by hbm2java
 */
public class Contact  implements java.io.Serializable {


     private int contactid;
     private String email;
     private Integer telefoon;
     private Integer gsm;
     private Integer fax;

    public Contact() {
    }

	
    public Contact(int contactid) {
        this.contactid = contactid;
    }
    public Contact(int contactid, String email, Integer telefoon, Integer gsm, Integer fax) {
       this.contactid = contactid;
       this.email = email;
       this.telefoon = telefoon;
       this.gsm = gsm;
       this.fax = fax;
    }
   
    public int getContactid() {
        return this.contactid;
    }
    
    public void setContactid(int contactid) {
        this.contactid = contactid;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getTelefoon() {
        return this.telefoon;
    }
    
    public void setTelefoon(Integer telefoon) {
        this.telefoon = telefoon;
    }
    public Integer getGsm() {
        return this.gsm;
    }
    
    public void setGsm(Integer gsm) {
        this.gsm = gsm;
    }
    public Integer getFax() {
        return this.fax;
    }
    
    public void setFax(Integer fax) {
        this.fax = fax;
    }
}

