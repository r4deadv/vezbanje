package users;

import java.util.ArrayList;

public class Users {
    public static void main(String[] args) {
        ArrayList usersToAdd = new ArrayList();
        usersToAdd.add(new User(4,"Goran"));
        usersToAdd.add(new User(2, "Ilija"));
        usersToAdd.add(new User(6, "Nikola"));
        
        ArrayList users = new ArrayList();
        users.add(new User(1, "Petar"));
        users.add(new User(2, "Jovan"));
        users.add(new User(3, "Zoran"));
        
        for(int i=0; i<usersToAdd.size(); i++){
            boolean userExists = false;
            for(int j=0; j<users.size(); j++){
                if(((User)users.get(j)).Id==((User)usersToAdd.get(i)).Id){
                    users.set(j, (User)usersToAdd.get(i));
                    userExists = true;
                }
            }
            if(!userExists){
                users.add((User)usersToAdd.get(i));
            }else {
                userExists = false;
            }
        }
        for (Object u : users) {
            User usr = (User)u;
            System.out.println(usr.Id + ":" + usr.ime);            
        }
    }
    
}
