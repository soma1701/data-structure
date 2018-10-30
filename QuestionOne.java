public class QuestionOne {
    public static void rotateArr(int arr[],int start, int end){
        while(start<end){
         int temp = arr[start];
         arr[start]= arr[end];
         arr[end] = temp;
         start++;
         end--;
        }
    }
    public static void printArr(int arr[]){
        for(int arr1:arr){
            System.out.print(" "+arr1);
        }
    }
    public static int searchElement(int arr[],int element){
        int position =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==element) {
                position=i;
                break;
            }
        }
        return position;
    }
    public static void qusetionThree(int arr[],int sum){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("sum of "+arr[i]+"and "+arr[j]+" is "+sum);
                    count++;
                }

            }
        }
    }
    public static int maxNumber(int arr[]){
        int sumArr=0;
        int currVal=0;
        for(int i=0;i<arr.length;i++){
            sumArr = sumArr + arr[i];
            currVal = currVal + (i*arr[i]);
        }
        int maxRes = currVal;
        for(int j=1;j<arr.length;j++){
            currVal = currVal+sumArr-arr.length*arr[arr.length-j];
            if(currVal>maxRes)
                maxRes=currVal;
        }
        return maxRes;
    }
    public static int maxSum(int arr[]){
        int result = 0;
        int size = arr.length;
        for(int i=0; i<size;i++){
            int currentSum =0;
            for(int j=0;j<size;j++){
              int index = (i+j)%size;
              currentSum+=j*arr[index];
            }
            result=Math.max(result,currentSum);
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = {8,3,1,2};
        int maxSum = maxNumber(arr);
        System.out.println("maximum summation of array:- "+maxSum);
       /* int sum =6;
        int maxSum = maxNumber(arr);
        System.out.println("max possible summation "+maxSum);*/
        /*qusetionThree(arr,sum);*/
        /*int element=5;
        int position = searchElement(arr,5);
        System.out.println("Element found at index "+position);*/
       /* rotateArr(arr,0,arr.length-1);
        rotateArr(arr,1,arr.length-1);
        printArr(arr);*/

    }
}
