package usersexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsersExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("users.txt"));
        String line;
        while((line=br.readLine())!=null){
            line = line.replace("\\", ",");
            String[] lineArr = line.split(",");
            System.out.println("User id: " + lineArr[0].split(":")[1]);
            System.out.println("Firs name: " + lineArr[1].split(":")[1]);
            System.out.println("Last name: " + lineArr[2].split(":")[1]);
            System.out.println("Jmbg: " + lineArr[3].split(":")[1]);
            System.out.println("------------------------------");
        }
    }
    
}
