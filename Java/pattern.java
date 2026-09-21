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
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display Using For Loop.");
            System.out.println("2. Display Using While Loop.");
            System.out.print("Enter 1 or 2 : ");
            int choice = sc.nextInt();

            if(choice == 1){
                Display_1();
                break;
            }
            else if(choice == 2){
                Display_2();
                break;
            }
            else{
                System.out.println("Enter valid Choice.!");
            }
        }
        sc.close();
    }
}
