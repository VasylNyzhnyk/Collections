import java.util.ArrayList;
import java.util.List;

public class IncrementalCollectionDemo {

    public static void main(String[] args) {
        IncrementalCollection incrementalCollection = new IncrementalCollection();
        List<Integer> arrayList = new ArrayList<>();
        incrementalCollection.addElement(arrayList);
        incrementalCollection.removeElement(arrayList);
        incrementalCollection.getElement(arrayList);
        incrementalCollection.setElement(arrayList);


        System.out.println(arrayList);


    }
}