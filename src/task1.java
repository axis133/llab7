import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Введите подстроку:");
        String substring = scanner.nextLine();

        System.out.println("Введите слово для вставки:");
        String wordToInsert = scanner.next();

        String[] words = text.split(" ");

        StringBuilder newText = new StringBuilder();
        for (String word : words) {
            if (word.endsWith(substring)) {
                newText.append(word).append(" ").append(wordToInsert).append(" ");
            } else {
                newText.append(word).append(" ");
            }
        }

        System.out.println("Новый текст:");
        System.out.println(newText.toString());
    }
}
