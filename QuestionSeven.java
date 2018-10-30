public class QuestionSeven {
    public static void pushZeroToEnd(int[] arr,int size){
        int count =0;
        int tempArr[] = new int[size];
        int j =0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0)
                tempArr[count++] = arr[i];
        }
        for (int elements:tempArr) {
            System.out.print(elements+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={0,1,0,2,0,3,4,0,0,0,7};
        int size = arr.length;
        pushZeroToEnd(arr,size);

    }
}
