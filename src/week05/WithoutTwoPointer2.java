package week05;

import java.util.HashMap;
import java.util.Map;

public class WithoutTwoPointer2 {
    public static void main(String[] args) {

        // Time Complexity:  O(n^2)

        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };
        System.out.println(sum(arr, 5)); // {2=3}
        System.out.println(sum(arr, 25)); // {}
    }

    public static Map<Integer, Integer> sum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    map.put(arr[i], arr[j]);
                }
            }
        }
        return map;
    }
}

