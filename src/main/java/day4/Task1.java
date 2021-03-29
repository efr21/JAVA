/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */

package day4;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int count_eight = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 8) {
                count_eight += 1;
            }
        }

        int count_one = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                count_one += 1;
            }
        }

        int even_nums = 0;
        int odd_nums = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                even_nums += 1;
            } else {
                odd_nums += 1;
            }
        }

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }




        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + count_eight);
        System.out.println("Количество чисел равных 1: " + count_one);
        System.out.println("Количество ченых чисел: " + even_nums);
        System.out.println("Количество нечетных чисел: " + odd_nums);
        System.out.println("Сумма всех элементов массива: " + sum);



    }
}
