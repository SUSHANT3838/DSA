import java.util.*;

public class pattern {
    // For loop
    public static void Display_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Using For Loop ===");
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    // while loop
    public static void Display_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Using While Loop ===");
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        while(i < n){
            int j = 1;
            while(j < i + 1){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
    public static void main(String[] args){
        //Display_1();// for looe
        Display_2();// while loop
    }
}
