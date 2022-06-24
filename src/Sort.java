import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int myArray[]={1,3,-1,5,78,0,7};
        int x=0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                int temp = 0;
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int element: myArray) {
            System.out.println(element);
        }
    }
}
