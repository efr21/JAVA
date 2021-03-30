/**
 *  Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */


package day4;
public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = (int) (Math.random() * 10000);
        }


        int max =nums[0];
        int min =nums[0];

        int count_0 = 0;
        int sum_0 = 0;

        for (int num : nums) {
            if (num >= max) {
                max = num;
            } else if (num < min) {
                min = num;
            } else if (num % 10 == 0) {
                count_0 += 1;
                sum_0 += num;
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(count_0);
        System.out.println(sum_0);
    }
}
