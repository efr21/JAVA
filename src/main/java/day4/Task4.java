/**
 * Создать новый массив размера 100 и заполнить его случайными
 * числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение
 * суммы и индекс первого элемента тройки.
 */

package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10000);
        }

        int max_index = -1;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length -2; i++) {
            int sum_i  = 0;
            for (int j =0; j < 3; j++) {
                sum_i += nums[j + i];
            }
            if (sum_i > max_sum) {
                max_sum =sum_i;
                max_index = i;
            }

        }



        System.out.println(max_sum);
        System.out.println(max_index);



    }
}
