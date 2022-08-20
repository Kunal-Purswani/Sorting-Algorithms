import java.util.Scanner;

class InsertionSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                for (int j = i; j > 0 && (arr[j] < arr[j - 1]); j--) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
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
        is.insertionSort(arr);
        System.out.print("\nSorted Array: ");
        is.printArray(arr);
        sc.close();
    }
}
