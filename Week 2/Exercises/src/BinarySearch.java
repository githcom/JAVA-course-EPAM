/**
 * Created by AVK on 03.03.2017.
 */

/*public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int middle = data.length / 2;
        if (numberToFind > data[middle]){
            for (int i = middle; i < data.length; i++){
                if (numberToFind == data[i]){
                    System.out.println(i);
                } else {
                    continue;
                }
            }
        } else if ((numberToFind < data[middle])) {
            for (int j=0; j<middle; j++){
                if (numberToFind == data[j]){
                    System.out.println(j);
                } else {
                    continue;
                }
            }
        }
        }
        // PUT YOUR CODE HERE
    }*/

/*for (int i=0; i<data.length; i++){
        if (numberToFind == data[i]){
        System.out.println(i);
        } else {
        continue;*/

public class BinarySearch {
            public static void main(String[] args) {
                int data[] = { 3, 6, 7, 10, 34, 56, 60 };
                int numberToFind = 10;
                System.out.println(findIndexInArray(data,numberToFind));
                    }

            public static int findIndexInArray(int[] data, int numberToFind){

                        for(int i=0; i<data.length; i++) {
                            if (numberToFind == data[i]) {
                                return i;
                            }
                        }
                return -1;
            }
        }