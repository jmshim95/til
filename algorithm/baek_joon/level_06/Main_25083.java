import java.io.*;

public class Main_25083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb
        .append("         ,r'\"7\n")
        .append("r`-_   ,'  ,/\n")
        .append(" \\. \". L_r'\n")
        .append("   `~\\/\n")
        .append("      |\n")
        .append("      |");

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}