import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        boolean success = false;

        while (N >= 0) {
            if (N % 5 == 0) {
                count += N / 5;
                success = true;
                break;
            } 
            N -= 3;
            count += 1;
        }

        if (success) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    } 
}

