public class Main {
    public static int[] sumArr(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arrayOne.length];
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < result.length; i++) {
                result[i] = arrayOne[i] + arrayTwo[i];
            }
        } else {
            throw new RuntimeException("Разная длина массивов!");
        }
        return result;
    }

    public static void printArray(int[] arr, String nameF) {
        System.out.println(nameF +":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 54, 89, 79, 46, 51, 23, 15, 46};
        int[] arr2 = {9, 87, 4, 564, 225, 12, 35, 64, 85, 133, 15};

        printArray(arr, "Массив 1");
        printArray(arr2, "Массив 2");

        printArray(sumArr(arr, arr2), "Сумма маcсивов");
    }
}