import java.io.*;

public class Main_2743 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int l = s.length();

        bw.write(String.valueOf(l));
        br.close();
        bw.close();
    }
}