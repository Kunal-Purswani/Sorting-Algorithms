import java.util.Scanner;

class MergeSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[start + i];
        for (int i = 0; i < n2; i++)
            right[i] = arr[mid + 1 + i];
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        // Getting user input
        System.out.print("Enter no. of elements: ");
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n < 1)
                System.out.print("Please enter a value greater than 0: ");
        } while (n < 1);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.print("\nSorted Array: ");
        ms.printArray(arr);
        sc.close();
    }
}
