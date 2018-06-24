import java.util.Scanner;

public class SilniaIteracyjna {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 1;
        for (int i = n; i > 0; i--) {
            a = a * i;
        }
        System.out.println(a);
    }
}
