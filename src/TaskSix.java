import java.util.Random;

public class TaskSix {
    //TODO Задача 6*: Вычислить среднее значение элементов в трехмерном массиве
    // У вас есть трехмерный массив чисел, представляющий собой набор матриц.
    // Ваша задача - вычислить среднее значение всех элементов в этом
    // трехмерном массиве.

    public static void main(String[] args) {

        Random random = new Random();
        int[][][] arr = new int[3][3][3];
        double average = 0;
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = random.nextInt(100);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.println();
                for (int k = 0; k < arr.length; k++) {
                    sum += arr[i][j][k];
                    temp++;
                    System.out.print(arr[i][j][k] + "  ");
                    average = (double)sum/temp;

                }
            }
        }
        System.out.println("\nAverage: " + average);

    }
}
