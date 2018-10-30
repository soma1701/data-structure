public class SwappingArr {

    public static void reverseArr(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArr(int arr[]){
        for (int arr1:arr) {
            System.out.print(arr1+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,67,8,9};
        int n = arr.length;
        int k =2;
        reverseArr(arr,0,n-1);
        reverseArr(arr,0,n-k-1);
        reverseArr(arr,n-k,n-1);
        printArr(arr);
    }

}
