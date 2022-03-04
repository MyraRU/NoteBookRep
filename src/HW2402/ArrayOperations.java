package HW2402;


import java.util.Arrays;

final class ArrayOperations {

    static void maxIndex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        System.out.println(max);
    }

    static void minIndex(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min])
                min = i;
        }
        System.out.println(min);
    }


    static int indexOf(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

    static void sum (int[] arr){
        int sumArr = 0;
        for (int i = 0; i < arr.length ; i++) {
            sumArr += arr[i];
        }
        System.out.println(sumArr);
    }

    static void replace (int[] arr, int oldInt, int newInt){
        for (int i = 0; i < arr.length ; i++) {
            if (oldInt == arr[i]){
                arr[i] = newInt;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        int arr[] = {3, -2, 4, 10, 15, 1};

        arrayOperations.minIndex(arr);                                    // Вывод index минимального числа в массиве

        arrayOperations.maxIndex(arr);                                    // Вывод index максимального числа в массиве

        System.out.println(arrayOperations.indexOf(arr, 11));      // Поиск числа 11 в массиве и вывод его index, иначе -1

        arrayOperations.sum(arr);                                         // Вывод суммы чисел находящихся масиве

        arrayOperations.replace(arr,3,33);                   // Поиск в массиве числа 3, если такое есть то заменить его на 33


    }
}

