package Unit_2;

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        String day = sc.next();
        String category = switch(day){ // yield instead of break
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                yield "Weekday";
            case "Saturday", "Sunday":
                yield "Weekend";
            case null: // case null is also accessible after java 17
                yield "Empty day";
            default:
                yield "Unknown";
        };
        System.out.println(day + " is a " + category + ".");
    }

//    public static String getDayCategory(String day){ // static keyword is used to directly call the func in main instead of creating an object
//        return switch(day){
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday"; // use arrow with return
//            case "Saturday", "Sunday" -> "Weekend";
//            default -> "Unknown";
//        };
//    }
}
