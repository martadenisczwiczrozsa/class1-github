package test;

public class SmallestIntegerDivisible {
    public static void main(String[] args) {

        int number = getNumberDivisibleFor(20);
        System.out.println(number);
    }

    public static int getNumberDivisibleFor (int target) {
        int finalNumber = target;

        while (true) {
            int count = 0;
            for (int i = 2; i <= target; i++) {
                if (finalNumber % i == 0) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == target-1) {
                break;
            }

            finalNumber+=2;
        }
        return finalNumber;
    }
}



