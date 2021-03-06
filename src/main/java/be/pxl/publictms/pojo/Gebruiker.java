package be.pxl.publictms.pojo;
// Generated 19-dec-2013 20:16:01 by Hibernate Tools 3.2.1.GA


import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Gebruiker generated by hbm2java
 */
@Entity
public class Gebruiker implements java.io.Serializable {


     @Id
     private int gebruikerid;
     private String gebruikersnaam;
     private String paswoord;
     private int werknemerid;
     private boolean administrator;
     
    public Gebruiker() {
    }

	
    public Gebruiker(int gebruikerid, String gebruikersnaam, String paswoord, int werknemerid, boolean administrator) {
        this.gebruikerid = gebruikerid;
        this.gebruikersnaam = gebruikersnaam;
        this.paswoord = paswoord;
        this.werknemerid = werknemerid;
        this.administrator = administrator;
    }
   
    public int getGebruikerid() {
        return this.gebruikerid;
    }
    
    public void setGebruikerid(int gebruikerid) {
        this.gebruikerid = gebruikerid;
    }
    
    public String getGebruikersnaam() {
        return this.gebruikersnaam;
    }
    
    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }
    public String getPaswoord() {
        return this.paswoord;
    }
    
    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public int getWerknemerid() {
        return werknemerid;
    }

    public void setWerknemerid(int werknemerid) {
        this.werknemerid = werknemerid;
    }
    
    public boolean getAdministrator() {
        return administrator;
    }
    
    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
    
    
    @Override
    public String toString(){
        return this.gebruikersnaam + " " + this.paswoord;
    }
}


