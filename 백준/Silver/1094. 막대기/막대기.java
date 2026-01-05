import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int stick = Integer.parseInt(st.nextToken());
        int count = 0;
        int stickLength[] = { 64, 32, 16, 8, 4, 2, 1};

        for (int i=0; i<stickLength.length; i++) {

            if (stickLength[i] <= stick ) {

                stick = stick - stickLength[i];
                count +=1;
            }

            if (stick ==0) {
                break;
            }
            
        }
        System.out.println(count);
    }
}
