import java.io.*;

public class Main_2908_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] sArr = s.split(" ");

        char[] ca = sArr[0].toCharArray();
        char[] cb = sArr[1].toCharArray();

        int ia = (ca[2] - 48) * 100 +  (ca[1] - 48) * 10 + ca[0] - 48;
        int ib = (cb[2] - 48) * 100 +  (cb[1] - 48) * 10 + cb[0] - 48;

        bw.write(String.valueOf(Math.max(ia, ib)));
        br.close();
        bw.close();
    }
}