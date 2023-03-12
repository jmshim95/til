import java.io.*;

public class Main_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        short max = 0;
        short index = 0;

        for (short i = 1; i <= 9; i++) {
            short a = Short.parseShort(br.readLine());
            if (max < a) {
                max = a;
                index = i;
            }
        }

        sb.append(max).append("\n").append(index);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}