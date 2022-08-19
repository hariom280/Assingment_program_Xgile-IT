public class Condtion_switch {
    public static void main(String[] args) {
        //int num = 2;
        //int num = 10;
        //String dayName = "Friday";
        String dayName = "Tuesday";

        //Switch statement
       /* switch(num){
            case 0:
                System.out.println("The number is 0 ");
                break;
            case 1:
                System.out.println("The number is 1 ");
                break;
            case 2:
                System.out.println("The number is 2 ");
                break;
            default:
                System.out.println("This is not a number");
        }*/

        switch(dayName){
            case "Sunday":
                System.out.println("Sunday");
                break;
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("This is not DayName");
        }
    }
}
