package main;
import java.util.*;
/**
 *
 * @author Maia
 */
public class World {
    
    static int year;
    static int season;
    static int day;
    
    public int getYear(){
        return year;
    }//getyear
    
    public int getSeason(){
        return season;
    }//getseason
    
    public int getDay(){
        return day;
    }//getday
    
    public void initiateWorld(){
        year = 0;
        season = 0;
        day = 0;
    }//initiateworld
    
    public void incrementDay(){
        int daysInYear = 6;
        if (day>=daysInYear){
            day=0;
            year++;
            season=1;   //season=1 in first half of year, =2 in last half
        }else{
            day++;
            if (day>=(daysInYear/2))
                season=2;
        }//else
    }//incrementday
}
