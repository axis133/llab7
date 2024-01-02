import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите число n:");
        int n = scanner.nextInt();

        String[] sentences = text.split("[.?!]");

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");

            String[] newWords = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                int newIndex = (i + n) % words.length;
                newWords[newIndex] = words[i];
            }

            StringBuilder newSentence = new StringBuilder();
            for (int i = 0; i < newWords.length; i++) {
                if (i != 0) {
                    if (newWords[i - 1].endsWith(",") || newWords[i - 1].endsWith(":")) {
                        newSentence.append(newWords[i]);
                    } else {
                        newSentence.append(" ").append(newWords[i]);
                    }
                } else {
                    newSentence.append(newWords[i]);
                }
            }

            System.out.println(newSentence);
        }
    }
}
