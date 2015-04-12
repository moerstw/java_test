import java.math.BigInteger;

public class qT {

  public static void main(String[] args) {
    String a = "1";
    BigInteger b = new BigInteger(a);

    System.out.println(a.substring(a.lastIndexOf(' ') + 1));
    System.out.println(b.and(new BigInteger("3")));
  }
}

// itemKey.compareTo(outKey.substring(outKey.lastIndexOf(' ') + 1)) > 0) {}
