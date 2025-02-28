import java.util.Random;

public class TaskFive {
    //TODO Задача 5*: Найти сумму элементов двумерного массива
    // У вас есть двумерный массив чисел, например, матрица. Ваша задача -
    // написать программу, которая находит сумму всех элементов в этом массиве.

    public static void main(String[] args) {

        Random random = new Random();
        int[][] arr = new int[3][3];
        int sumOfElements = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                sumOfElements += arr[i][j];
            }
        }
        System.out.println("\nSum of elements: " + sumOfElements);
    }
}
