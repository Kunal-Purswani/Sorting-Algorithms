import java.util.Scanner;

class QuickSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        int temp;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }
        temp = arr[end];
        arr[end] = arr[++i];
        arr[i] = temp;
        return i;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
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
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.print("\nSorted Array: ");
        qs.printArray(arr);
        sc.close();
    }
}
