public class SwapPosition {

    public static void swap(int arr[]){
        int tempArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=0;
            j=arr[i];
            tempArr[j]=i;
        }
        for(int elements:tempArr)
            System.out.print(elements+" ");
    }
    public static void main(String args[]){
        int arr[]={1,3,0,2};
        swap(arr);
    }
}
