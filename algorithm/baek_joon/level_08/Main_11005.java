import java.io.*;

public class Main_11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int index = 0;
        int ahrt = N;
        int skajwl;
        int[] arr = new int[index+1];
        boolean flag = true;
        while (true) {
            int[] newArr = new int[index + 1];
            int _ahrt = ahrt / B;
            skajwl = ahrt % B;
            ahrt = _ahrt;

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = skajwl;
            arr = newArr;
            if (!flag) {
                break;
            }
            if (_ahrt < B) {
                flag = false;
            }
            index++;
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > 9) {
                sb.append((char) (arr[i] + 55));
            } else {
                sb.append(arr[i]);
            }
        }

        String[] split = sb.toString().split("");
        StringBuilder _sb = new StringBuilder();
        boolean sFlag = true;
        for (String s : split) {
            if (s.equals("0") && sFlag) {
            } else {
                sFlag = false;
                _sb.append(s);
            }
        }

        bw.write(_sb.toString());
        br.close();
        bw.close();
    }
}