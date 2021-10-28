package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {

    public static void main(String[] args) {
        int n = 6;
        int result;

        List<Integer> binary = new ArrayList<>();

        while (n > 0) {
            result = n % 2;
            binary.add(result);
            n = n / 2;
        }
        Collections.reverse(binary);

        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.size(); i++) {
            int current = binary.get(i);
            if (current == 1) {
                count++;
            } else  {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);
    }
}
