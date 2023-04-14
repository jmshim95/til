import java.io.*;

public class Main_2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        bw.write(String.valueOf(arr[k-1]));
        br.close();
        bw.close();
    }
}