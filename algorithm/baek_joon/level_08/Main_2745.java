import java.io.*;

public class Main_2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        char[] N = input[0].toCharArray();
        int B = Integer.parseInt(input[1]);
        int result = 0;
        int index = 0;
        for (int i = N.length-1; i >= 0; i--) {
            int _N = N[index] > 57 ? N[index] - 55 : N[index] - 48;
            int temp = B;

            if (i > 0) {
                for (int j = 1; j < i; j++) {
                    temp *= B;
                }
            } else {
                temp = 1;
            }

            result += temp * _N;
            index++;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}