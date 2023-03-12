import java.io.*;
import java.util.StringTokenizer;

public class Main_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        short n = Short.parseShort(br.readLine());
        short[] arr = new short[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) arr[i] = Short.parseShort(st.nextToken());

        short v = Short.parseShort(br.readLine());
        short c = 0;

        for (short i : arr) if(v == i) c++;

        bw.write(String.valueOf(c));

        br.close();
        bw.close();
    }
}
