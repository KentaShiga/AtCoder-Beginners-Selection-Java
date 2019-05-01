package PlacingMarbles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_13 = sc.next();

        String s1 = s_13.substring(0, 1);
        String s2 = s_13.substring(1, 2);
        String s3 = s_13.substring(2, 3);

        System.out.println(howManyMath(s1,s2,s3));

    }

    private static int howManyMath(String s1, String s2, String s3){
        int result = 0;
        String one = "1";
        if (s1.equals(one)){
            result++;
        }
        if (s2.equals(one)){
            result++;
        }
        if (s3.equals(one)){
            result++;
        }
        return result;
    }
}
