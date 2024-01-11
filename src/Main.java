import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxSpending = arr[0];
        for (final int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");

        int minSpending = arr[0];
        for (final int current : arr) {
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", sum / 30);
    }

    public static void task4() {
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}
