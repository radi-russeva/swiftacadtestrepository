import java.util.Scanner;

public class Task2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        for( int i = 0; i<= count; i++){
            int number = sc2.nextInt();
            if(number%2==0) {
                System.out.println(number);
            }


        }
    }
}
