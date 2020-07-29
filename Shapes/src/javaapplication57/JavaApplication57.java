package javaapplication57;
public class JavaApplication57 {
    public static void main(String[] args) {
      Kvadrat kvadrat = new Kvadrat("kvadrat", "crvena", 5);
      Krug krug = new Krug("krug", "plava", 3);
      Pravougaonik pravougaonik = new Pravougaonik("pravougaonik", "zelena", 4, 7);
      System.out.println(kvadrat);
      System.out.println(krug);
      System.out.println(pravougaonik);
      krug.area();
      kvadrat.area();
      pravougaonik.area();
      System.out.println(krug.boja);
      System.out.println(kvadrat.boja);
      System.out.println(pravougaonik.boja);
    }
    
}
