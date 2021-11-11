package testExercises;

//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start time: ");
        int startTime = sc.nextInt();

        System.out.print("Enter the end time: ");
        int endTime = sc.nextInt();


        int duration = 0;

        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - (startTime - endTime);
        }

        System.out.println(duration + " hours");
    }
}
