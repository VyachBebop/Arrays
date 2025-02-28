public class TaskSeven {
    //TODO Задача 7*: Найти самую длинную строку в массиве строк
    // У вас есть массив строк, и ваша задача -
    // найти самую длинную строку в этом массиве.

    public static void main(String[] args) {

    String [] arr = new String[]{"Hello ","World ","i am ","learning ","Java"};
    int maxLine = 0;
    int counter = 0;
    String maxLineStr;

        for (int i = 0; i < arr.length; i++) {
            if (maxLine < arr[i].trim().length()) {
                maxLine = arr[i].trim().length();
                counter = i;
            }
        }
        maxLineStr = arr[counter];
        System.out.println("The longest line in array is: " + maxLineStr);
    }
}
