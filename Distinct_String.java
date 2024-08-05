package practice;

import java.util.Arrays;

public class Distinct_String {
    public static String kthDistinct(String[] arr, int k) {
        String[] distinct = new String[arr.length];
        int m = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                distinct[m] = arr[i];
                m++;
            }
        }
        
        if (k > m) {
            return "";
        } else {
            return distinct[k - 1];
        }
    }
    
    public static void main(String[] args) {
        String[] ar = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        System.out.println(kthDistinct(ar, k));
    }
}
