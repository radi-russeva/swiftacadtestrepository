import java.util.Scanner;

public class Task0c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if(age >= 0 && age < 18) {
            System.out.printf(" This person is %d years old and can't drink",age);
        }

        else {
            if(age >= 18) {
                System.out.printf( "This person is %d years old and can drink",age);

            }
            else System.out.println("This is not a person's age. Please be smarter and type in something else.");
        }
    }
}
