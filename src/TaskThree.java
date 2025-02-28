import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    //TODO Задача 3: Поиск заданного элемента в массиве
    // Предоставлен массив чисел и значение, которое нужно найти.
    // определить, содержит ли массив заданное значение, и если да, то найти
    // индекс этого значения в массиве.

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("\nEnter a number to search: ");
        int number = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("The number - " + number + " on the Index: " + i);
            }
        }
    }
}
