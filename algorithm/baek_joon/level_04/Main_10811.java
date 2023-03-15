import java.io.*;
import java.util.StringTokenizer;

public class Main_10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int i = 0; i < m ; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0])-1;
            int b = Integer.parseInt(s[1])-1;
            int lastIndex = b;
            for (int j = a; j < b; j++) {
                int temp = arr[j];
                arr[j] = arr[lastIndex];
                arr[lastIndex] = temp;

                lastIndex--;
                if(lastIndex <= j) break;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}