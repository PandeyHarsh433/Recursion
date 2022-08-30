public class SelectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selSort(int [] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int small = arr[i];
            for(int j=0;j<arr.length-i-1;j++) {
                if(small>arr[j]) {
                    small = arr[i];
                }

                int temp = arr[i];
                arr[j] = arr[i];
                arr[]
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,6,5,2};
        selSort(arr);
        printArray(arr);
    }

}
