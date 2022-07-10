import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number");
        int n = scanner.nextInt();

        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = temp + i;
        }
        System.out.println(temp);
    }
}
