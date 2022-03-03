package HW2402;


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

    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        int arr[] = {-2, 3, 4, 10, 15, 1};

        arrayOperations.minIndex(arr);
        arrayOperations.maxIndex(arr);
        System.out.println(arrayOperations.indexOf(arr, 10));
        arrayOperations.sum(arr);
    }
}

