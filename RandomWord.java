import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    String inpuString = StdIn.readString();
    if (!StdIn.isEmpty() && StdRandom.bernoulli()) {
      StdOut.println(inpuString);
    }
  }
}