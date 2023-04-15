import java.io.*;

public class Main_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int[] arr = new int[n];
            int index = 0;
            int result = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[index] = i;
                    result += i;
                    index++;
                }
            }

            int[] newArr = new int[index];
            System.arraycopy(arr, 0, newArr, 0, newArr.length);

            if (result == n) {
                sb.append(n).append(" = ").append(newArr[0]);
                for (int i = 1; i < newArr.length; i++) {
                    sb.append(" + ").append(newArr[i]);
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }


        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}