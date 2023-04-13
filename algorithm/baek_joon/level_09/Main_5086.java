import java.io.*;

public class Main_5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            boolean isFactor = false;
            boolean isMultiple = false;

            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                isFactor = true;
            }

            if (a % b == 0) {
                isMultiple = true;
            }

            if (isFactor && !isMultiple) {
                sb.append("factor").append("\n");
            } else if (!isFactor && isMultiple) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }

        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}