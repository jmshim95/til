import java.io.*;
import java.util.StringTokenizer;

public class Main_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        short a = Short.parseShort(st.nextToken());
        short b = Short.parseShort(st.nextToken());
        short[] c = new short[a];

        for (short i = 0; i < a; i++){
            c[i] = (short) (i+1);
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            short d = Short.parseShort(st.nextToken());
            short e = Short.parseShort(st.nextToken());
            short temp = c[d-1];
            c[d-1] = c[e-1];
            c[e-1] = temp;
        }

        for (short i : c) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}