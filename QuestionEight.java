public class QuestionEight {

    public static void main(String args[]){
        int arr[]={2,15,4,6,1,3};
        int size = arr.length;
        int tempArr[] = new int[size];
        int k=3,count=0,temp=0;
        for(int i=0;i<arr.length;i++) {
                if (arr[i] <= k)
                    tempArr[count++] = arr[i];
                else
                    temp = arr[i];
        }
        for (int elemnets:tempArr) {
            System.out.print(elemnets+" ");
        }
    }

}
