
package javaapplication37;

public class JavaApplication37 {

    public static void main(String[] args) {
       
        int tank_x = 10;
        int tank_y = 12;
        int tank_width = 5;
        int tank_height = 4;
        
        int projectile_x = 7;
        int projectile_y = 10;
        
        /*
        System.out.println("Hit is successful: " + 
                (projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height))
        );

        projectile_x++;
        projectile_y++;
        System.out.println("Hit is successful: " + 
                (projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height))
        );
  
        projectile_x++;
        projectile_y++;
        System.out.println("Hit is successful: " + 
                (projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height))
        );
  
        projectile_x++;
        projectile_y++;
        System.out.println("Hit is successful: " + 
                (projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height))
        );
       
        projectile_x++;
        projectile_y++;
        System.out.println("Hit is successful: " + 
                (projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height))
        );
        System.out.println(projectile_x);
        System.out.println(projectile_y);
        */
        projectile_x++;
        projectile_y++;
        projectile_x++;
        projectile_y++;
        projectile_x++;
        projectile_y++;
        projectile_x++;
        projectile_y++;
        
        boolean res = (
                projectile_x > tank_x && projectile_x < (tank_x + tank_width) && 
                projectile_y > tank_y && projectile_y < (tank_y + tank_height)
                );
        System.out.println("Hit is successful: " + res);
        
    }
    
}
