package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers {

    public static void main(String[] args) {

        //g - crie um método que recebe uma lista de ints e um int target.
        // O método deve encontrar e retornar todos ints que encontrar na lista que sejam iguais ao int target;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a target number: ");
        int target = sc.nextInt();

        List<Integer> number = new ArrayList<>();
        System.out.println("Enter a number: ");
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());
        number.add(sc.nextInt());

        List<Integer> numbersList = getNumbers(number, target);
        System.out.println(numbersList);
        sc.close();
    }

    public static List<Integer> getNumbers(List<Integer> number, int target) {

        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            Integer currentNumber = number.get(i);
            if (currentNumber == target) {
                numbersList.add(currentNumber);
            }
        }
        return numbersList;

    }
}
