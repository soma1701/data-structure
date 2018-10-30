import java.util.Arrays;
import java.util.Collections;

public class MultiplyArr {

    public static void multiplyArr(int arr[]){
        int copyArr[] = new int[arr.length];
        int tempArr[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[i];
        }
        int temp=0;
        for(int i=0;i<tempArr.length-2;i++){
            tempArr[temp] = arr[i]*arr[i+2];
            temp++;
        }

        for(int elements:tempArr)
            System.out.print(elements+" ");
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6};
        multiplyArr(arr);
        
    }
}
