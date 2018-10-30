public class Rearrange {

    public static void moveNegElementsToEnd(int arr[]){
        int tempArr[] = new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                tempArr[c]=arr[i];
            c++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                tempArr[c]=arr[i];
                c++;
            }
        }

        for(int elements:tempArr)
            System.out.print(elements+" ");
    }
    public static void main(String args[]){
        int arr[] = {12,11,-13,-5,6,-7,5,-3,-6};
        moveNegElementsToEnd(arr);
    }
}
