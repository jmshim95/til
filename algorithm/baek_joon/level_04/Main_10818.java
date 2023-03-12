import java.io.*;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(max < a) max = a;
            if(min > a) min = a;
        }

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }
}