package week10;

public class XOR {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        System.out.println(x ^ y); // 6

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
