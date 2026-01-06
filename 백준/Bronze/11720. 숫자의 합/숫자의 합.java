import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 숫자의 개수 (사실 계산에는 필요 없음)
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄: 숫자 문자열
        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        String nums = st.nextToken();
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += nums.charAt(i) - '0';
        }

        System.out.println(total);
    }
}
