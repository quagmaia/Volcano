package main;

import java.util.*;
public class Villager {
	
	static Random ran = new Random();
	
        static String name;
        static int age;
        static int birthday;
        static int id;
        static int fishStat;
        static int farmStat;
        static int buildStat;
        
        Villager(int i){
            id=i;
        }
        
        void setAge(int i){
            age=1;
        }
        
        void setName(String s){
            name=s;
        }
        
        void setBirthday(int i){
            birthday=i;
        }
        
        public int getID(){
            return id;
        }
        
        public String getName(){
            return name;
        }
        
        public int getAge(){
            return age;
        }
        
        public int getBirthday(){
            return birthday;
        }
        
        public int getFishStat(){
            return fishStat;
        }
        
        public int getFarmStat(){
            return farmStat;
        }
        
        public int getBuildStat(){
            return buildStat;
        }
	
	public String nameGen(){
                String syllables[] = {"ba","be","bi","bo","bu","ca","ce","ci","co","cu","da","de","di","do","du",
			"fa","fe","fi","fo","fu","ga","ge","gi","go","gu","ha","he","hi","ho","hu","ja","je","ji",
			"jo","ju","ka","ke","ki","ko","ku","la","le","li","lo","lu","ma","me","mi","mo","mu","na",
			"ne","ni","no","nu","pa","pe","pi","po","pu","qua","que","qui","quo","qu","ra","re","ri",
			"ro","ru","sa","se","si","so","su","ta","te","ti","to","tu","va","ve","vi","vo","vu","wa",
			"we","wi","wo","wu","ya","ye","yi","yo","yu","za","ze","zi","zo","zu"};
                int syllLength = syllables.length;
		String firstName = null;
		String lastName = null;
			
		int firstSyll = ran.nextInt(4); //determine number of syllables in first name
		//System.out.println("first syll: " + (firstSyll+1));
		int lastSyll = ran.nextInt(5);	//determine number of syllables in last name
		//System.out.println("last syll: " + (lastSyll+1));
			
		int syll = 0;
		
		for (int i = 0; i <= firstSyll; i++){
			syll = ran.nextInt(syllLength);
			if (i==0)
				firstName = syllables[syll];
			else
				firstName = firstName + syllables[syll];
		}//end for
				
		for (int i = 0; i <= lastSyll; i++){
			syll = ran.nextInt(syllLength);
			if (i==0)
				lastName = syllables[syll];
			else
				lastName = lastName + syllables[syll];
		}//end for
			
		name = firstName + " " + lastName;
		return name;
			
	}//end nameGen
        
        public int ageGen(){
            age = ran.nextInt(50);
            return age;
        }
        
        public void incrementAge(){
            age++;
        }
	
	int statGen(){
            	int newAge = 0;
                int youthAge = 1;
                int teenAge = 10;
                int adultAge = 20;
                int elderAge = 50;
                int maxStat = 100;
		int stat = 0;
                
		if (age == newAge){
			stat = ran.nextInt(3);                  //newborns(0) can be up to 2			
		}else if (teenAge > age && age > youthAge){		
			stat = ran.nextInt((maxStat/10)+1);     //children(1-9) can be up to 10 (if max is 100)
		}else if (adultAge > age && age > teenAge){
			stat = ran.nextInt((maxStat/4)+1);      //teens(10-19) can be up to 25 (if max is 100)
		}else if (elderAge > age && age > adultAge){
			stat = ran.nextInt(((maxStat/2)+1));    //adults(20-49) can be up to 50 (if max is 100) 
		}else if (age > elderAge){
			stat = ran.nextInt(((maxStat/4)*3)+1);  //elders(50) can be up to 75 (if max is 100)
		}
		return stat;
	}
        
        public void statAssign(){
            fishStat=statGen();
            farmStat=statGen();
            buildStat=statGen();
        }
        

}//end Villager
