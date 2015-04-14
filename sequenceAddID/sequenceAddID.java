import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
public class sequenceAddID {

  public static void main(String[] args) throws IOException {
    if (args.length < 1) {
      System.out.println("[filename]");
      System.exit(1);
    }
    BufferedReader br = new BufferedReader(new FileReader(args[0]));
    PrintWriter writer = new PrintWriter("I" + args[0]);
    try {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      int uniqID = 0;
      while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        writer.println(uniqID++ + "\t" + line);
        line = br.readLine();
      }
      String everything = sb.toString();
    } finally {
      br.close();
      writer.close();
    }
  }
}
