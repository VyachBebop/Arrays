import java.util.Random;

public class TaskTwo {
    //TODO Задача 2: Поиск дубликатов в массиве
    // Вам предоставляется массив элементов, и ваша задача - определить, есть ли
    // дубликаты (повторяющиеся элементы) в массиве. Если есть, выведите
    // информацию о том, какие элементы являются дубликатами и их индексы

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] > 1) {
                System.out.print("Element " + arr[i] + " repeats on indexes: ");
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
                count[arr[i]] = 0;
            }
        }
    }
}

