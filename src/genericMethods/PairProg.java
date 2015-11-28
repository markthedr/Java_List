package genericMethods;

public class PairProg{

    public static void main(String[] args){
        Pair<String, Integer> grade1 = new Pair<String,Integer>
            ("William", 90);
        Pair<String, Integer> grade2 = new Pair<String,Integer>
            ("Brown", 90);

        System.out.println(grade1.first());
        System.out.println(grade1.second());
        System.out.println(grade2.first());
        System.out.println(grade2.second());

    }
}
