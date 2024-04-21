import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notes = new int[8];
        for (int i = 0; i < 8; i++) {
            notes[i] = scanner.nextInt();
        }

        String result = checkSequence(notes);
        System.out.println(result);
    }

    public static String checkSequence(int[] notes) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 7; i++) {
            if (notes[i] < notes[i + 1]) {
                descending = false;
            } else if (notes[i] > notes[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            return "ascending";
        } else if (descending) {
            return "descending";
        } else {
            return "mixed";
        }
    }
}
