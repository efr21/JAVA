/**
 * Создать новый массив размера 100 и заполнить его случайными
 * числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение
 * суммы и индекс первого элемента тройки.
 */

package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = (int) (Math.random() * 10000);
        }

        int[] temp_arr = new int[98];

        int max = 0;
        int index_max = 0;

        for(int i = 0; i < 100; i++) {
            if((i +1 != 100) && (i+2 != 100)) {
                temp_arr[i] = nums[i] + nums[i+1] + nums[i+2];
            }
        }

        for(int i = 0; i < 98; i++) {
            if(temp_arr[i] >= max) {
                max = temp_arr[i];
                index_max = i;
            }
        }

        System.out.println(max);
        System.out.println(index_max);



    }
}
