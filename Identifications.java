import java.util.*;
//HashMaps 
public class Identifications{
    public HashMap<Integer , String> group;
    String[] names = 
    {
        "Chris", "Sarah", "William", 
        "John", "Elaine", "Emily", 
        "Oliver", "Eve", "Aaliyah", "Marcus", "Michelle", 
        "Archim"
    };
    public Identifications(){
        group = new HashMap<>();
        setClass();
    }
    
    public void setClass(){
        
        for(String h: names){
            group.put(randomNum(), h);
        }
    }
    public int randomNum(){
       int osis = (int)(Math.random() * 9000)+ 999 ;
         return osis;
    }
    
    
    public int randImNum(){
        String osis = "";
         for (int i = 0 ; i < 4 ; i++){
             osis += String.valueOf((int)(Math.random() * 9)); 
             
         }
         return Integer.valueOf(osis);
    }
    public String toString(){
        return group.toString();
    }
}