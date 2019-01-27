import java.util.Scanner;

public class Counter {
    boolean condition = true;

    Scanner scanner = new Scanner (System.in);

    public void counter() {


        while (condition) {
            System.out.println ("Podaj liczbe ");
            int firstNum = scanner.nextInt ();
            if (firstNum < 100) {
                System.out.println ("liczba jest za mała");
            }
            if (100 < firstNum && firstNum < 200) {
                if (firstNum % 3 != 0) {
                    System.out.println ("liczba ne dzieli się na 3");
                }
                if (firstNum % 3 == 0) {
                    condition = false;
                    System.out.println ("liczba ok");
                }

            }
        }
    }
}


