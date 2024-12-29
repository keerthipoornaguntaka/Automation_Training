package Java_pack;

public class Loopings {
    public static void main(String args[]) {
        int i = 10;
        // for loop
        for (int a=1; a <= 5; a++) {
            System.out.println("" + a);
        }
        System.out.println("For loop has ended.");

        // for each
        int arr[] = {1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("For-each loop has ended.");

        //while
        while (i <= 5) {

            System.out.println(i);
            i++;
        }
        System.out.println("While loop has ended.");

        // Using do-while loop
        do {
            System.out.println("Loop: " + i);
            i++;
        } while (i <= 5);
        System.out.println("Do-While loop has ended.");

    }
}
