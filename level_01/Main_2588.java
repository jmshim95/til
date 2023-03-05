import java.util.Scanner;

public class Main_2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int b_one = b % 10;
        int b_ten = b % 100;
        int b_hund = b % 1000;

        int result_one = a * b_one;
        int result_ten = a * (b_ten - b_one);
        int result_hund = a * (b_hund - b_ten);
        int result = result_one + result_ten + result_hund;

        System.out.println(result_one);
        System.out.println(result_ten / 10);
        System.out.println(result_hund / 100);
        System.out.println(result);
    }
}