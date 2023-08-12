
package pkgswitch;

import java.time.Clock;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
       Scanner in=new Scanner (System.in);
       /*
       //variables declaration
       String food;
       //get user input
       System.out.print("Enter the food:");
       food=in.nextLine();
       //condition
       switch(food){
           case"white rice":{
               System.out.println(food+" Rs.200");
           }
           case"parotta":{
               System.out.println("one set of"+food+" Rs.60");
               break;
           }
           case"curd rice":{
               System.out.println(food+" Rs.50");
               break;
           }
           case"egg dosa":{
               System.out.println("One set of"+food+" Rs.60");
               break;
           }
           case"lemon rice":{
               System.out.println(food+" Rs.50");
               break;
           }
           default:{
               System.out.println("Sorry This Food is Not Available");
           }
       }
       */
       /*
       coimbature to Chennai
       */
       /*
       String travel;
        System.out.print("Enter The Train Ticket Booking Place :");
        travel=in.nextLine();
        switch(travel){
            case("chennai"):{
                System.out.println("coimbatore to " +travel+" ticket Rate is Rs.2500");
                break;
            }
            case("madurai"):{
                System.out.println("coimbatore to " + travel+" ticket Rate is Rs.1500");
                break;
            }
            case("tiruneveli"):{
                System.out.println("coimbatore to " + travel+" ticket Rate is Rs.800");
                break;
            }
            case("tenkasi"):{
                System.out.println("coimbatore to " + travel+" ticket Rate is Rs.1000");
                break;
            }
            case("ooty"):{
                System.out.println("coimbatore to " + travel+" ticket Rate is Rs.3000");
                break;
            }
            default:
                System.out.println("SORRY Mam/Sir this Train Ticket are Not Available ");
        }
*/
       /*
       1-sunday 2-Monday ........
       */
       int num;
        System.out.print("Enter the Number in 1-7:");
        num=in.nextInt();
        switch(num){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
               break; 
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
            }
        }
        
    }
    
}
