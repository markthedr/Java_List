package genericClasses;

public class ListDriver {

    public static void main(String[] args){
        List<String> gList = new List<String>(10);
        gList.add("milk");
        gList.add("apples");
        gList.add("cakes");

        System.out.println("Grocery genericClasses.List: " + gList.toString());

        //now add a new list to show the generic capability of the class

        List<Integer> iList = new List<Integer>(10);
        iList.add(1);
        iList.add(2);
        iList.add(3);

        System.out.println("Integer genericClasses.List: " + iList.toString());

    }
}
