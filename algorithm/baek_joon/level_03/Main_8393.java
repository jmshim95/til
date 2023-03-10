import java.io.*;

public class Main_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i = 1; i <= a; i++)
            r += i;

        bw.append(String.valueOf(r));
        bw.flush();
        br.close();
        bw.close();
    }
}