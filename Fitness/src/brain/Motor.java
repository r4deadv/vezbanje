package brain;

import java.sql.SQLException;
import java.util.List;
import model.DbHelper;
import model.Rezultat;
import ui.*;

public class Motor {
    
    public Motor(){
        this.db = new DbHelper();
        this.ui = new Interfejs();
    }
    DbHelper db;
    Interfejs ui;
    
    void add() throws SQLException{
       Rezultat zaUnos = ui.getRezultat(); 
       db.add(zaUnos);
    }
    void delete() throws SQLException{
        int id = ui.getId();
        db.delete(id);
    }
    void edit() throws SQLException{
        int id = ui.getId();
        Rezultat r = db.get(id);
        ui.izmeniRezultat(r);
        db.update(r);
    }
    
    void showAll() throws SQLException{
        List all = db.get();
        for (Object o : all) {
            System.out.println(o);
        }
    }
    
    void showFiltered() throws SQLException{
        String filter = ui.getIme();
        filter = " where ime = '" + filter + "'";
        List all = db.get(filter);
        for (Object o : all) {
            System.out.println(o);
        }
    }
    
    void run() throws SQLException{
        System.out.println("Dobro dosao u aplikaciju za pracenje rezultata\nFitness loger V1.0 Alpha");
        mainloop:
        while(true){
            int odabranaKomanda = ui.meni();
            switch(odabranaKomanda){
                case 1:
                    add();
                break;
                case 2:
                    delete();
                break;
                case 3:
                    edit();
                break;
                case 4:
                    showAll();
                break;
                case 5:
                    showFiltered();
                break;
                case 6:
                    break mainloop;
            }
        }
    }
    
    public static void start() throws SQLException{
        Motor m = new Motor();
        while(true){
            String[] creds = m.ui.login();
            if(m.db.login(creds[0], creds[1])){
                m.run();
            } else {
                System.out.println("Invalid user");
            }
        }
    }
}
