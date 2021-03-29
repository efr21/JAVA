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

        for(int i = 0; i< 12; i++) {
            for(int j = 0; j < 8; j++) {
                nums[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println(Arrays.deepToString(nums));



        int[] temp = new int[12];

        for(int i = 0; i < 12; i++) {
            int row_i = 0;
            for(int j = 0; j < 8; j++) {
                row_i += nums[i][j];
            }
            temp[i] = row_i;
        }

        System.out.println(Arrays.toString(temp));

        int max_sum = 0;
        int max_index = 0;

        for(int i = 0; i < 12; i++) {
            if (temp[i] >= max_sum) {
                max_sum = temp[i];
                max_index = i;
            }
        }



        System.out.println(max_index);


    }
}
