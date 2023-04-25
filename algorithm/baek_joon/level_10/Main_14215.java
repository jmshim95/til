import java.io.*;

public class Main_14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int[] arr = {a, b, c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if(arr[0] + arr[1] > arr[2]) {
            bw.write(String.valueOf(arr[0] + arr[1] + arr[2]));
        } else {
            bw.write(String.valueOf((arr[0] + arr[1]) * 2 - 1));
        }

        br.close();
        bw.close();
    }
}