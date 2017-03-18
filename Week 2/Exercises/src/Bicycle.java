/**
 * Created by AVK on 04.03.2017.
 */
public class Bicycle {

    public static void main(String[] args) {

        int [] first = {1, 2, 3, 4};
        int [] second = new int [first.length];

        for (int i=0; i<first.length; i++){
            second[i] = first[i] * 3;
        }
        System.out.println(second);
    }
}



