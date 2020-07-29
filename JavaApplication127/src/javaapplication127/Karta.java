package javaapplication127;

import java.io.Serializable;

public class Karta implements Serializable {
    private String broj;
    private String boja;
    private String kod;
    
    public String getBoja(){
        return this.boja;
    }
    
    public void setBoja( String boja){
        this.boja = boja;
    }

    /**
     * @return the broj
     */
    public String getBroj() {
        return broj;
    }

    /**
     * @param broj the broj to set
     */
    public void setBroj(String broj) {
        this.broj = broj;
    }
}
