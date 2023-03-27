import java.io.*;

public class Main_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] lst = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();

        for (String s : lst)
            str = str.replaceAll(s, " ");

        bw.write(String.valueOf(str.length()));
        br.close();
        bw.close();
    }
}