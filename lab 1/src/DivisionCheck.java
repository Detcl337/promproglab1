import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int number = in.nextInt();
        System.out.println("Введите числа: ");
        int[] myArray = new int[number];
        for (int i = 0; i <number ; i++) {
            myArray[i] = in.nextInt();
        }
        System.out.print("Среди них на 7 и на 5 делятся: ");
        for (int i = 0; i <number ; i++) {
            int y = myArray[i]%5;
            int z = myArray[i]%7;
            if (y == 0){
                if (z == 0){
                    System.out.print(myArray[i]+" ");
                }
            }
        }
    }
}