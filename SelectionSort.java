import java.util.Scanner;

class SelectionSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void selectionSort(int[] arr) {
        int minInd, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }
            if (arr[minInd] != arr[i]) {
                temp = arr[minInd];
                arr[minInd] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
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
        ss.selectionSort(arr);
        System.out.print("\nSorted Array: ");
        ss.printArray(arr);
        sc.close();
    }
}
