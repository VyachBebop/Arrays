import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    //TODO Задача 1: Переворот массива
    // Напишите программу, которая переворачивает массив, так чтобы последний
    // элемент стал первым, предпоследний - вторым и так далее.
    // Используйте Random для заполнения массива. Вывести свои было и стало.

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int arrLenght = scanner.nextInt();
        int[] arr = new int[arrLenght];

        System.out.println("First Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSecond Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
