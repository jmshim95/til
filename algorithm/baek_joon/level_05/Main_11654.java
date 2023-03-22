import java.io.*;

public class Main_11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ascii = br.readLine().toCharArray()[0];

        bw.write(String.valueOf(ascii));
        br.close();
        bw.close();
    }
}