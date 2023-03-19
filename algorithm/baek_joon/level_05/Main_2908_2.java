import java.io.*;

public class Main_2908_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] cArr = s.toCharArray();
        char temp;
        int arrLength = cArr.length;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') break;
            temp = cArr[i];
            cArr[i] = cArr[arrLength - 1];
            cArr[arrLength - 1] = temp;
            arrLength--;
        }

        String[] rs = String.valueOf(cArr).split(" ");

        bw.write(String.valueOf(Math.max(Integer.parseInt(rs[0]), Integer.parseInt(rs[1]))));
        br.close();
        bw.close();
    }
}