import java.util.Scanner;

class BubbleSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
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
        bs.bubbleSort(arr);
        System.out.print("\nSorted Array: ");
        bs.printArray(arr);
        sc.close();
    }
}