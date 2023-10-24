
/**
 * Aaron Kang
 * 1-2
 */
public class Methods {
    static String nonLetters = ",.:;()[]{}!?@#$%^&* ";
    
    //helper method
    public static String removeNonCharacters(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i+1);
            if (!nonLetters.contains(letter)) {
                newString += letter;
            }
        }
        return newString;
    }

    public static boolean isPalindrome(String str) {
        str = removeNonCharacters(str);
        int left = 0;
        int right = str.length()-1;
        while (left <= right) {
            if (!str.substring(left, left+1).equals(str.substring(right, right+1))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String toPigLatin(String str) {
        String[] strings = str.split(" ");
        String newString = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 2) {
                strings[i] = strings[i].substring(1) + strings[i].substring(0, 1) + "ay";
            }
        }
        return String.join(" ", strings);
    }

    public static int isAscending(int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++) {
            int n = i;
            while (n != 0) {
                if (n%10 <= (n/10)%10) {
                    break;
                }
                n = n/10;
            }
            if (n == 0) {
                count++;
            }
        }
        return count;
    }

    public static void timesTable(int n) {
        int maxLength = Integer.toString(n*n).length();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int product = i*j;
                System.out.print(" ".repeat(maxLength+1-Integer.toString(product).length()));
                System.out.print(product);
            }
            System.out.println();
        }
    }
}

