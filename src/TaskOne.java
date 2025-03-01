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
        int temp;

        System.out.println("First Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
