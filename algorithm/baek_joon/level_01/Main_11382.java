import java.util.Scanner;

public class Main_11382 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] split = a.split(" ");
        long result = 0;

        for (String s : split) {
            result += Long.parseLong(s);
        }

        System.out.println(result);
    }
}