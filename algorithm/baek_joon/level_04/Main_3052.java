import java.io.*;

public class Main_3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        short[] arr = new short[42];

        for (int i = 0; i < 10; i++) {
            short a = Short.parseShort(br.readLine());
            arr[a % 42] += 1;
        }

        short a = 0;
        for (short i : arr) {
            if(i>0) a++;
        }

        bw.write(sb.append(a).toString());
        br.close();
        bw.close();
    }
}