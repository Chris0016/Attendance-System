import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Identifications chem = new Identifications();
        Calendar time = Calendar.getInstance(); 
        System.out.println(chem.group);
        short count = 0; 
        int late;
        while(true){
            try{
                System.out.println("Enter last four digits of osis: ");
               late = input.nextInt();
                if(chem.group.containsKey(late)){
                    System.out.println(chem.group.get(late) +" late: "+ timer() +"\n\n");
                    chem.group.remove(late);
                     count++;
                }
                else{
                    System.out.println("User not fou again");
                    continue;
                }
            }
           catch( Exception e){
               System.out.print("Wrong input type");
               input.nextLine();
               continue;
           }
         if(count == 3) break;
        }
    }
    //create a metod for getting time.
    public static Date  timer(){
        Calendar time = Calendar.getInstance(); 
        return time.getTime();
    }
}