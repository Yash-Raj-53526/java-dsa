package BinarySearch;

import java.util.ArrayList;

public class Unbound_search {
    public static int search(ArrayList<Integer> arr, int target) {
        if (arr.get(0) == target) {
            return 0;
        }
        int i = 1;
        while (arr.get(i) < target) {
            i *= 2;
        }
        if (arr.get(i) >= target) {
            int start = i / 2;
            int end = i;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr.get(mid) == target) {
                    return mid;
                } else if (arr.get(mid) < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        } else {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 5;
        int index = search(arr, target);
        System.out.println(index);
    }
}
