import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( a==0 && b==0){
                return;
            }
            System.out.println(a+b);
        }
    }
}