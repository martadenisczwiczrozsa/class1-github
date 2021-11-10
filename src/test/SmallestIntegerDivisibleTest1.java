package test;

public class SmallestIntegerDivisibleTest1 {

    public static void main(String[] args) {

        int target = 3;

        // 3 % 1 = 0
        // 3 % 2 = 1
        // 3 % 3 = 0

        // 4 % 1 = 0
        // 4 % 2 = 0
        // 4 % 3 = 1
        // 4++

        // 5 % 1 = 0
        // 5 % 2 = 1
        // 5++

        // 6 % 1 = 0
        // 6 % 2 = 0
        // 6 % 3 = 0

//        for (int i = 1; i <= target; i++) {
//            if (3 % i == 0) {
//                System.out.println("É MMC");
//            } else {
//                System.out.println("Não é MMC");
//            }
//        }
//
//        System.out.println();

        int target2 = 10;
        int count = 0;

        int test = 2518;

        for (int i = 1; i <= target2; i++) {
            if (test % i == 0) {
                count++;
            } else {
                break;
            }
        }

        if (count == target2) {
            System.out.println(target2);
        } else {
            System.out.println("Não é");
        }

        count = 0;
        test++;

        for (int i = 1; i <= target2; i++) {
            if (test % i == 0) {
                count++;
            } else {
                break;
            }
        }

        if (count == target2) {
            System.out.println(target2);
        } else {
            System.out.println("Não é");
        }

        count = 0;
        test++;

        for (int i = 1; i <= target2; i++) {
            if (test % i == 0) {
                count++;
            } else {
                break;
            }
        }

        if (count == target2) {
            System.out.println("Sim " + test);
        } else {
            System.out.println("Não é");
        }

    }
}



