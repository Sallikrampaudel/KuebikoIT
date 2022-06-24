public class MaxArray {
    public static void main(String[] args) {
        int arr[]= {-56, -999, -123, 67, -100};
        int max=Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The Max Number is =>" + max);
    }
}
