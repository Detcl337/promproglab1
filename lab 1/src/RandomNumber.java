import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int number = in.nextInt();
        Random rd= new Random ();
        int[] myArray = new int[number];
        for (int i = 0; i <number ; i++) {
            int x = rd.nextInt(21)-11;
            myArray[i] = x;
        }
        for (int i = 0; i <number ; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i <number ; i++) {
            System.out.print(myArray[i]+" ");
        }
    }
}