package test;

public class SmallestIntegerDivisibleTest2 {

    public static void main(String[] args) {

        int target = 20;
        int count = 0;
        int test = target;

        while (true) {
            for (int i = 1; i <= target; i++) {
                if (test % i == 0) {
                    count++;
                } else {
                    break;
                }
            }
            //verifica se o número testado na rodada é divisor de todos os 20
            if (count == target) {
                break;
            }

            count = 0;
            test++;

        }

        System.out.println(test);
    }
}



