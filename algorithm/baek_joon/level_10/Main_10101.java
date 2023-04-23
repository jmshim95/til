import java.io.*;

public class Main_10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] tr = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            tr[i] = Integer.parseInt(br.readLine());
            sum += tr[i];
        }

        if (sum != 180) {
            bw.write("Error");
        } else if(tr[0] == tr[1] && tr[1] == tr[2]) {
            bw.write("Equilateral");
        } else if (tr[0] != tr[1] && tr[1] != tr[2] && tr[0] != tr[2]) {
            bw.write("Scalene");
        } else {
            bw.write("Isosceles");
        }

        br.close();
        bw.close();
    }
}