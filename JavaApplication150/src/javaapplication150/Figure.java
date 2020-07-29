package javaapplication150;
public enum Figure {
    Konj(2,"Mustang"), Lovac(3,"Laufer"), Top(1,"Beli"), Kralj(5,"Beli"), Kraljica(6,"Beli");
    
    int broj;
    String oznaka;
    Figure(int broj, String oznaka){
        this.broj = broj;
        this.oznaka = oznaka;
    }
}
