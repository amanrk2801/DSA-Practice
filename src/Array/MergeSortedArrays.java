package Array;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and compare elements
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}

