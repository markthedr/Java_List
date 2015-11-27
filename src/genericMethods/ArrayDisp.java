package genericMethods;

public class ArrayDisp {

    static <T> void Display(T[] arr){
        for (int i=0; i<arr.length; i++){
            if(arr[i] != null){
                System.out.println(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){

        //method with single type parameter
        //simple array with names
        //now display it and use it again with a different type

        String[] names = new String[10];
        names[0] = "David";
        names[1] = "Cynthia";
        names[2] = "Raymond";
        names[3] = "Jennifer";
        names[4] = "Bryan";
        names[5] = "Clayton";
        names[6] = "Terry";
        names[7] = "Danny";
        names[8] = "Mark";
        names[9] = "Emma";

        Display(names);

        Integer[] numbers = new Integer[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        Display(numbers);

    }

}
