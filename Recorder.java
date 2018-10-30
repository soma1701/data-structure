public class Recorder {
    public static void recorderArr(int arr[],int index[]){
        int tempArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tempArr[index[i]]=arr[i];
        }
        for(int elements:tempArr)
            System.out.print(elements+" ");
    }
    public static void main(String args[]){
        int arr[]={10,11,12,43,87,9};
        int index[]={1,0,2,5,4,3};
        recorderArr(arr,index);
    }
}
