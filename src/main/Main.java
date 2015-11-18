

package main;
import java.util.*;
/**
 *
 * @author Maia
 */
public class Main{

    public static void main(String[] args) {
        
        Random ran = new Random();
        
        World w = new World();
        w.initiateWorld();
        
        Villager v1 = new Villager(001);
        Villager v2 = new Villager(002);
        
        v1.nameGen();
        v1.ageGen();
        v1.statAssign();
        v1.setBirthday(ran.nextInt(6));
        System.out.println("Name: " + v1.getName());
        System.out.println("Age: " + v1.getAge());
        System.out.println("Birthday: " + v1.getBirthday());
        System.out.println("Build: " + v1.getBuildStat());
        System.out.println("Fish: " + v1.getFishStat());
        System.out.println("Farm: " + v1.getFarmStat());
        
        System.out.println();
        
        v2.nameGen();
        v2.ageGen();
        v2.statAssign();
        v2.setBirthday(ran.nextInt(6));
        System.out.println("Name: " + v1.getName());
        System.out.println("Age: " + v1.getAge());
        System.out.println("Birthday: " + v2.getBirthday());
        System.out.println("Build: " + v1.getBuildStat());
        System.out.println("Fish: " + v1.getFishStat());
        System.out.println("Farm: " + v1.getFarmStat()); 
        
        System.out.println();
        
        for (int i = 0; i < 20; i++){
            int currentDay = w.getDay();
            System.out.println("Day " + w.getDay() + " of year " + w.getYear());
            if (currentDay == v1.getBirthday()){
                System.out.println(v1.getBirthday() + " A");
                v1.incrementAge();
                System.out.println(v1.getName() + " is now " + v1.getAge() + " years old.");
            }//if
            
            if (currentDay == v2.getBirthday()){
                System.out.println(v2.getBirthday() + " B");
                v2.incrementAge();
                System.out.println(v2.getName() + " is now " + v2.getAge() + " years old.");
            }//if
            
            w.incrementDay();
        }
        
    }//main
}//class main