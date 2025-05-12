import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int to = 1;
        for (int i=1; i<=n; i++) {
            to *= i;
        }
        System.out.println(to);
    }
}