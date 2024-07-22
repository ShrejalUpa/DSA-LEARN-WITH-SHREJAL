// import java.util.HashMap;
// import java.util.Map;

// public class TCS {
//     public static void main(String[] args) {
//         // Input sales for each day of the week
//         int[] sales = {40, 30, 70, 80, 20, 90, 30};
        
//         // Create a map to store day names
//         Map<Integer, String> dayNames = new HashMap<>();
//         dayNames.put(1, "Sunday");
//         dayNames.put(2, "Monday");
//         dayNames.put(3, "Tuesday");
//         dayNames.put(4, "Wednesday");
//         dayNames.put(5, "Thursday");
//         dayNames.put(6, "Friday");
//         dayNames.put(7, "Saturday");
        
//         // Loop through the sales and print the day names with sales
//         for (int i = 0; i < sales.length; i++) {
//             System.out.println(dayNames.get(i + 1) + " : " + sales[i]);
//         }
//     }
// }




import java.util.Scanner;
public class TCS{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Days:-");
        System.out.print("Day 1:");
        int a= sc.nextInt();
        System.out.print("Day 2:");
        int b= sc.nextInt();
        System.out.print("Day 3:");
        int c= sc.nextInt();
        System.out.print("Day 4:");
        int d= sc.nextInt();
        System.out.print("Day 5:");
        int e= sc.nextInt();
        System.out.print("Day 6:");
        int f= sc.nextInt();
        System.out.print("Day 7:");
        int g= sc.nextInt();
        System.out.println("Sunday :"+a);
        System.out.println("Monday :"+b);
        System.out.println("Tuesday :"+c);
        System.out.println("Wednesday :"+d);
        System.out.println("Thursday :"+e);
        System.out.println("Friday :"+f);
        System.out.println("Saturday :"+g);
    }
}