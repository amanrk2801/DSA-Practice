package Array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};

        List<Integer> leaders = findLeaders(array);

        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }

        // Reverse the list to maintain the original order of elements
        List<Integer> reversedLeaders = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            reversedLeaders.add(leaders.get(i));
        }

        return reversedLeaders;
    }
}

