import java.io.*;
import java.util.StringTokenizer;

public class Main_9498 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if (90 <= a && a <= 100) {bw.write("A");}
        if (80 <= a && a <= 89) {bw.write("B");}
        if (70 <= a && a <= 79) {bw.write("C");}
        if (60 <= a && a <= 69) {bw.write("D");}
        if (a < 60){bw.write("F");}

        br.close();
        bw.close();
    }
}