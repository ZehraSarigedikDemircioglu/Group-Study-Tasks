package week10;

public class XOR {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        // |3 + 5 - 2 x 3 x 5|= 22 => 2x2^0+2x2^1 = 6

        System.out.println(x ^ y); // 6

        int a = 5;
        int b = 7;

        // |5 + 7 - 2 x 5 x 7| = 58 => 8 x 2 ^ 0 + 5 x 2 ^ 1 = 18 => 8 x 2 ^ 0 + 1 x 2 ^ 1 = 10 => 1 x 2 ^ 1 = 2

        System.out.println(a ^ b); // 2

        // If they are same, gives 0, if one of them zero, result will be other number

        int[] nums = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2}; // 2 ^ 2 = 0, 1 ^ 1 = 0, 0 ^ 0 = 0, and 4 ^ 0 = 4

        int result = 0;
        for (int i : nums) {
            result ^= i;
        }

        // 2 ^ 2 = 0 , and 0 ^ 1 = 1
        System.out.println(result); // 1

    }
}
