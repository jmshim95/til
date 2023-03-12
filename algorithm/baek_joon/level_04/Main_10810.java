import java.io.*;
import java.util.StringTokenizer;

public class Main_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bucket = Integer.parseInt(st.nextToken());
        int in = Integer.parseInt(st.nextToken());

        int[] buckets = new int[bucket];
        for (int i = 0; i < in; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for (int j = a-1; j < b; j++) {
                buckets[j] = c;
            }
        }

        for (int i : buckets) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}