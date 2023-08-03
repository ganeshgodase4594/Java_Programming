
class panagram{

    public static void main(String[] args) {
        
        String str="Bawdsjogflickquartzvexnymph";

        System.out.println(str.length());
    }
}

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram(String str) {
        // Convert the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Create a boolean array to keep track of presence of alphabets
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is an alphabet, mark its presence in the array
            if ('a' <= ch && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all elements in the boolean array are true
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
