import java.util.Arrays;

public class QuestionSix {
     public static void rearrangeArr(int arr[]){
         int size = arr.length;
         int evenPosition = size/2;
         int oddPosition = size - evenPosition;
         int copyArr[] = new int [size];
         for(int i =0;i<size;i++){
             copyArr[i]= arr[i];
         }
         Arrays.sort(copyArr);
         int j = oddPosition-1;
         for(int i =0;i<size;i+=2){
             arr[i]=copyArr[j];
             j--;
         }
         j = oddPosition;
         for(int i =1; i<size;i+=2){
             arr[i]=copyArr[j];
             j++;
         }
         for (int elements:arr) {
             System.out.print(elements+" ");
         }
     }

     public static void main(String args[]){
         int arr[]={1,2,3,4,5,6,7};
         rearrangeArr(arr);

     }
}
