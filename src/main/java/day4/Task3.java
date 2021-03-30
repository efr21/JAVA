/**
 *Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
 * Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность
 * по колонкам). В консоль вывести индекс строки, сумма чисел в которой
 * максимальна. Если таких строк несколько, вывести индекс последней из них.
 */


package day4;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] nums = new int[12][8];

        for(int i = 0; i< nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                nums[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println(Arrays.deepToString(nums));

        int max_index = -1;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++) {
            int sum_row_i = 0;
            for(int j = 0; j < nums[i].length; j++) {
                sum_row_i += nums[i][j];
            }
            if (sum_row_i >= max_sum) {
                max_sum = sum_row_i;
                max_index = i;
            }
        }

        System.out.println(max_index);
    }
}
