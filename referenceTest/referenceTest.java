
import java.util.List;
import java.util.ArrayList;

public class referenceTest {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<Integer>();
    arrayList = callArrayList();
    for(Integer i : arrayList)
      System.out.println(i);
  }
  public static List<Integer> callArrayList() {
    ArrayList arr = new ArrayList();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    return arr.subList(2, 4);
  }
}
