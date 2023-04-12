import java.io.*;

public class Main_2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int up = Integer.parseInt(s[0]);
        int down = Integer.parseInt(s[1]);
        int goal = Integer.parseInt(s[2]);

        int days = (goal - down - 1) / (up - down) + 1;
        bw.write(String.valueOf(days));
        br.close();
        bw.close();
    }
}