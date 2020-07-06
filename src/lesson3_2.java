import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3_2 {
    public static void main(String[] args) {

        Scanner sc = getScanner();
        Random rnd = getRandom();
        String[] words = getStrings();
        String word;

        int n = getNext(rnd, words);
        char[] chs = words[n].toCharArray();
        char[] chCmp = new char[chs.length];
        chCmp(chs, chCmp);

        while (true) {
            System.out.print("Введите слово (0 to exit): ");
            word = sc.nextLine();
            if (word.equals("0")) {
                System.out.println("Спасибо за игру!");
                break;
            }
            if (word.equals(words[n])) {
                System.out.println("Вы угадали.");
                break;
            } else {
                System.out.println("Вы не угадали");
                char[] chWord = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    if (i >= chWord.length) {
                        break;
                    }
                    if (chs[i] == chWord[i]) {
                        chCmp[i] = chs[i];
                    }
                }
                System.out.println(String.valueOf(chCmp));
            }
        }
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

    private static Random getRandom() {
        return new Random();
    }

    private static String[] getStrings() {
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println(Arrays.toString(words));
        return words;
    }

    private static int getNext(Random rnd, String[] words) {
        int n = rnd.nextInt(words.length);
        System.out.println(words[n]);
        System.out.println("Программа загадала слово, попробуйте угадать");
        return n;
    }

    private static void chCmp(char[] chs, char[] chCmp) {
        for (int i = 0; i < chs.length; i++) {
            chCmp[i] = '*';
        }
    }
}
