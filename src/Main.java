import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // for-each
        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        
        for (String index : animals){
            System.out.println(index);
        }
    }
}