import java.io.*;
import java.util.HashMap;

public class Main_25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < 20; i++) {
            String[] grades = br.readLine().split(" ");
            if (grades[2].equals("P")) {
                continue;
            }
            sum += Double.parseDouble(grades[1]) * gradeMap.get(grades[2]);
            sum2 += Double.parseDouble(grades[1]);
        }

        double v = sum / sum2;
        bw.write(String.valueOf(v));
        br.close();
        bw.close();
    }
}