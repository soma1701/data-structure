import java.util.Arrays;

public class QuestionTen {

    public static void rearragePosNeg(int arr[]){
        int temp[] = new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i]==arr[i+1]){
                temp[count++]=arr[i]*2;
            }
            else if(arr[i]!=0 && arr[i]!=arr[i+1])
                temp[count++]= arr[i];
        }
        for (int elements:temp
             ) {
            System.out.print(elements+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,2,4,0,6,0};
        rearragePosNeg(arr);
    }
}
