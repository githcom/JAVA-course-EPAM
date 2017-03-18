/**
 * Created by AVK on 02.03.2017.
 */
public class MatrixPrint {
    public static void main(String args[]){
        String[][] array = {
                {" *"," 2"," 3"," 4"," *"},
                {" 6"," *"," 8"," *","10"},
                {"11","12"," *","14","15"},
                {"16"," *","18"," *","20"},
                {" *","22","23","24"," *"}};

                for (int i = 0; i < array.length; i++) {

                    for (int j = 0; j <array.length; j++) {

                        System.out.print(array[i][j] + " ");
                    }
                        System.out.println();
                }
    }
}
