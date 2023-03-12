import java.io.*;

public class Main_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        short[] students = new short[30];
        short[] reports = new short[28];
        short[] run = new short[students.length - reports.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = (short) (i + 1);
        }

        for (int i = 0; i < reports.length; i++) {
            reports[i] = Short.parseShort(br.readLine());
        }

        short index = 0;
        f:
        for (short student : students) {
            for (short report : reports) {
                if (report == student) continue f;
            }
            run[index] = student;
            index++;
        }

        short temp = 0;
        for (short i = 0; i < run.length; i++) {
            for (short j = (short) (i+1); j < run.length; j++) {
                if (run[i] > run[j]) {
                    System.out.println("run = " + run[i]);
                    temp = run[i];
                    run[i] = run[j];
                    run[j] = temp;
                }
            }
        }

        for (short i : run) {
            sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}