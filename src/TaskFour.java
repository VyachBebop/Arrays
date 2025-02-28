import java.util.Random;

public class TaskFour {
    //TODO Задача 4: Найти наименьший элемент в одномерном массиве чисел
    // У вас есть одномерный массив целых чисел. Ваша задача - найти
    // наименьший элемент в этом массиве с использованием цикла foreach.

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }

        for (int a : arr) {
            if (a < minValue) {
                minValue = a;
            }
            if (maxValue < a) {
                maxValue = a;
            }
        }
        System.out.println("\nMin value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}
