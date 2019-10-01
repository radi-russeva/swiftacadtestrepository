import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int reverseNum = 0;
       while(number > 0) {
           a = number%10;
           reverseNum = reverseNum*10 + a;
           number = number/10;

       }
       System.out.println(reverseNum);
    }
}
