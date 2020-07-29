package javaapplication129;

import java.util.Scanner;

public class JavaApplication129 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite naziv tenka");
        String naziv = scanner.nextLine();
        System.out.println("Unesite adresu do strane sa tenkom");
        String link = scanner.nextLine();
        System.out.println("Unesite adresu slike tenka");
        String slika = scanner.nextLine();
        
        sb.append("<html>\n");
        sb.append("<head></head>\n");
        sb.append("<body>\n");
        sb.append("<div style='border: 1px solid black; padding: 4px; width:250px; text-align: center;'>\n");
        sb.append("<h3>" + naziv + "</h3>\n");
        sb.append("<img src='" + slika + "' style='max-width=100%'>\n");
        sb.append("<a href='" + link + "'>Read more...</a>\n");
        sb.append("</div>\n");
        sb.append("</body>\n");
        sb.append("</html>\n");
        System.out.println(sb.toString());
    }
    
}
