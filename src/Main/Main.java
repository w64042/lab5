package Main;
import Main.Sum.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
            // 1
        Sum sum = new Sum();

        System.out.println(sum.dodaj(3, 2));
        System.out.println(sum.dodaj(3, 2, 1));

        System.out.println(sum.dodaj(3.0f, 2.5f));
        System.out.println(sum.dodaj(3.0f, 2.0f, 1.0f));




        //2
        exc();


    }

    public static void exc(){

        System.out.println("Podaj liczbe z ktorej chcesz wyciagnac pierwiastek");
        Scanner sc = new Scanner(System.in);

        double a = 0;

        while (true) {
            try {
                a = sc.nextDouble();

                break;

            }
            catch (InputMismatchException e) {

                System.out.println("Podaj poprawna liczbe, podana wartosc nie jest liczba");

                sc.next();
            }
        }

        if (a < 0) {
            throw new IllegalArgumentException("Pierwiastek nie istnieje");
        }

        System.out.print("Pierwiastek " + Math.sqrt(a));
    }


}
