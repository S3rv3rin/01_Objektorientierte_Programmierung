public class Test {

    public static void main(String[] args) {


        int [] a = {5,7,84,23,12,5};
        int [] b = {5,5,36,5,3,85};

        int counter = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if ( a[i] == b[j] ) counter++;
            }
        }
        System.out.println(counter);

    }

}