package Homework;

import java.math.BigInteger;

public class BenDaher {
//    Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno
//    pszenicy, na drugie 2 ziarna, na trzecie 4 ziarna i na każde następne
//    pole dwa razy więcej ziaren niż na pole poprzednie. Napisz program,
//    który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.

    public static void main(String[] args) {
        long grains = 1;
        long sum = 0;
        System.out.println("Początkowa liczba ziaren na pierwszym polu szachownicy wynosi: " + grains);
        for (int i = 1; i < 64; i++) {
            sum = (2 * grains) + sum;
            grains *= 2;
            System.out.printf("Na polu: %d jest ziaren: %d,%n", (i + 1), grains);
            System.out.printf("w sumie od 1 do %d  pola jest: %d ziaren.%n%n", (i + 1), sum);

        }
    }
}
