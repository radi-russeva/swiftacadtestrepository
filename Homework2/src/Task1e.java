import java.util.Scanner;

public class Task1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean t = true;
        for(int i = 1; i <= number; i++) {
            if(( number% i == 0) && (i!= 1) && (i!=number)) {
                t = false;
            } else
                t = true; //Somehow it only shows true

        }
        System.out.print(t);
    }
}
