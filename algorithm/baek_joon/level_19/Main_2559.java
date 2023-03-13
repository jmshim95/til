import java.io.*;
import java.util.StringTokenizer;

public class Main_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int range = n - (k - 1);
        int[] f = new int[n];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            f[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < range; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += f[j];
            }
            if (max < temp) {
                max = temp;
            }
        }

        bw.write(String.valueOf(max));
        br.close();
        bw.close();
    }
}