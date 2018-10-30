public class QuestionFive {

    public static int[] reverseArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start =0;
            int end = arr.length-1;
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void printArr(int arr[]){
        for (int elements:arr) {
            System.out.print(elements+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        reverseArr(arr);
        printArr(arr);

    }
}
