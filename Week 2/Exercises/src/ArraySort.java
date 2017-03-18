/**
 * Created by AVK on 02.03.2017.
 */

  public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};

        //PUT YOUR CODE HERE
        for (int i=0; i<array.length; i++){
            for (int j=i-1; j>=0; j--){
                if (array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}