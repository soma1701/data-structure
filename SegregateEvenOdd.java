public class SegregateEvenOdd {

    public static void evenOdd(int arr[]){
        int count=0;
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                temp[count] = arr[i];
                count++;
            }
        }
            for(int elements:temp)
                System.out.print(elements+" ");
        }
        public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        evenOdd(arr);
        }
    }

