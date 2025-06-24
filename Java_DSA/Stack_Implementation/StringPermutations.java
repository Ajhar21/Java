public class StringPermutations {
    // Recursive method to generate permutations
    private static void generatePermutations(String str, String prefix) {
        // Base case: if the string is empty, print the prefix
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        // Loop through the string to pick each character as the starting point
        for (int i = 0; i < str.length(); i++) {
            // Remove the chosen character and recurse
            String remaining = str.substring(0, i) + str.substring(i + 1);
            // System.out.println("Reamin is: "+remaining);
            // System.out.println();
            generatePermutations(remaining, prefix + str.charAt(i));
        }
    }

    // Method to initiate the permutation process
    public static void findPermutations(String str) {
        generatePermutations(str, "");
    }

    // Main method for testing
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of \"" + input + "\":");
        findPermutations(input);
    }
}
