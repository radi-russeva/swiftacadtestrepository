import java.util.Scanner;

public class Task2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        Scanner sc2 = new Scanner(System.in);
        for(int i = 0; i <=count; i++){

            int number = sc2.nextInt();
            a = a+number;
            System.out.println(a);
        }
        System.out.print(a); // doesn't work with system out, placed here
    }
}
