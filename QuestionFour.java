public class QuestionFour {

    public static int[] rearragneArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            while(arr[i]!=-1 && arr[i]!=i){
                int x = arr[i];
                if(arr[x]!=-1 && arr[x]!=x){
                    int y = arr[x];
                    arr[x] = x;
                    x= y;
                }
                arr[x]=x;
                if(arr[i]!=i){
                    arr[i]=-1;
                }
            }
        }
        return arr;
    }

    public static void printArr(int arr[]){
        for (int arr1:arr) {
            System.out.print(arr1+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={-1,-1,6,1,9,3,2,-1,4,-1};
        rearragneArr(arr);
        printArr(arr);
    }
}
