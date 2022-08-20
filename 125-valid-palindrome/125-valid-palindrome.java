class Solution {
    public boolean isPalindrome(String s) {

        var processedStringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            boolean isNumber = ch >= '0' && ch <= '9';
            boolean isUppercaseCharacter = ch >= 'A' && ch <= 'Z';
            boolean isLowercaseCharacter = ch >= 'a' && ch <= 'z';
            if (isNumber || isUppercaseCharacter || isLowercaseCharacter) {
                processedStringBuilder.append(ch);
            }
        }
        var ps = processedStringBuilder.toString().toLowerCase();

        boolean isPalindrome = true; 
        
        for (int l = 0, r = ps.length() - 1; l < r; l++, r--) {
            if (ps.charAt(l) != ps.charAt(r)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}