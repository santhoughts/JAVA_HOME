package InterviewPrepration;

import java.util.Arrays;

public class SortTheArray {

    public static void main(String[] args) {

        // Sample input
        String[] strs = {"flower", "flow", "flight"};

        // Create object of Solution class
        Solution solution = new Solution();

        // Call method and print result
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}


    class Solution {
        public String longestCommonPrefix(String[] strs) {

            StringBuilder sb = new StringBuilder();
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length-1];
            for(int i=0; i<Math.min(first.length(), last.length()); i++)
            {
                if(first.charAt(i) != last.charAt(i))
                {
                    return sb.toString();
                }
                sb.append(first.charAt(i));

            }

            return sb.toString();

}
    }


