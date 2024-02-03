package Assignment2;

import java.util.Scanner;

class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter the sentence");
        String s = scanner.nextLine();
        if (!isValid(s)) {
            System.out.println(s + " is an invalid input");
        }
        else {
            String result = arrangeAlphabetically(s);
            System.out.println(result);
        }
    }

 // Checking if the input sentence is valid
    private static boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

 // we are arranging the letters alphabetically in each word of the sentence
    private static String arrangeAlphabetically(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

 // checking through each word in the sentence
        for (String word : words) {
            char[] letters = word.toCharArray();
            java.util.Arrays.sort(letters);
            result.append(new String(letters)).append(" ");
        }
        return result.toString().trim();
    }
}
