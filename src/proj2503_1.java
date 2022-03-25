import java.util.Scanner;

/**
 * Класс возведения вводимого числа в степень по формуле
 * <p>
 * Разработчик : Стрцуго группа дата
 */
public class proj2503_1 {
    /**
     * Констурктор
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt(); //получаем число от пользователя
        int result = square(num);
        System.out.printf("Your number: %d \n", result);
        in.close();
    }

    /**
     * Функция возведения в степень по формуле
     *
     * @param num - вводимое число
     * @return готовый результат
     */
    static int square(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i * 2 + 1;
        }
        return result;
    }

}
