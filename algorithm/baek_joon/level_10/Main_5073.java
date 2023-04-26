import java.io.*;

public class Main_5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int[] tri = new int[3];
            String[] s = br.readLine().split(" ");

            for (int i = 0; i < 3; i++) {
                tri[i] = Integer.parseInt(s[i]);
            }

            int sum = tri[0] + tri[1] + tri[2];

            if (sum == 0) {
                break;
            } else {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <3; j++) {
                        if (tri[i] < tri[j]) {
                            int temp = tri[i];
                            tri[i] = tri[j];
                            tri[j] = temp;
                        }
                    }
                }

                if(tri[0] + tri[1] <= tri[2]) {
                    sb.append("Invalid").append("\n");
                } else if (tri[0] * 3 == sum) {
                    sb.append("Equilateral").append("\n");
                } else if (tri[0] != tri[1] && tri[0] != tri[2] && tri[1] != tri[2]) {
                    sb.append("Scalene").append("\n");
                } else if (tri[0] == tri[1] || tri[1] == tri[2] || tri[2] == tri[3]) {
                    sb.append("Isosceles").append("\n");
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}