package javaapplication126;

import java.io.Serializable;

public class Reket implements Serializable{
    private String naziv;
    private String boja;
    
    public String getNaziv(){
        return this.naziv;
    }
    
    public void setNaziv(String naziv){
        if(naziv.equals("Bomba")){
            System.out.println("Ne mozes sa bombom da igras");
            return;
        }
        this.naziv = naziv;
    }

    /**
     * @return the boja
     */
    public String getBoja() {
        return boja;
    }

    /**
     * @param boja the boja to set
     */
    public void setBoja(String boja) {
        this.boja = boja;
    }
    
    
}
