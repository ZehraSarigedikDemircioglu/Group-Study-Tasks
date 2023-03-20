package week09;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String str = "A";
        String str2 = "AB";
        String str3 = "ZY";

        System.out.println(titleToNumber(str)); // 26^0 + 0 = 1
        System.out.println(titleToNumber(str2)); // 26^1 + 2 = 28
        System.out.println(titleToNumber(str3)); // 26^2 + 25 = 701


    }
    public static int titleToNumber(String columnTitle) {
        // there will be a polynomial like this 26^0.x + 26^1.x + ...+26^(n-1).x, n = length
        // x will be (ch - 64) , ch current character from ASCII table

        int result = 0;

        for (char each : columnTitle.toCharArray()) {
//            int ch = each - 'A' + 1; // since 'A' is the first, others will take accordingly
            int ch = each - 64;
            result = result * 26 + ch;
        }
        return result;
    }
}
/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its
corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
Example 1:
Input: columnTitle = "A" Output: 1
Example 2:
Input: columnTitle = "AB" Output: 28
Example 3:
Input: columnTitle = "ZY" Output: 701
Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */
