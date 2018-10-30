import java.util.Arrays;

public class QuestionNine {
    public static void rearrangePosNeg(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
                arr[count++]=arr[i];
        }

        for (int elements:arr) {
            System.out.print(elements+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {12,11,-13,-5,6,-7,5,-3,-6};
        rearrangePosNeg(arr);
    }
}
