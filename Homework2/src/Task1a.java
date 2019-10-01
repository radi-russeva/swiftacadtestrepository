import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        while(number >=10)  // Counts number of digits
        {
            number = number/10;
        }
        System.out.println(number);







    }
}
