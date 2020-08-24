public class Surd {

  //surds of the form a+b*root(n) with a,b and n integers.

  private long a;
  private long b;
  private long n;

  public Surd(long a, long b, long n) {
    this.a = a;
    this.b = b;
    this.n = n;
  }

  public long[] getSurd() {
    long[] result = new long[] {a, b, n};
    return result;
  }

  public void printSurd() {
    System.out.println(a + " + " + b + " * sqrt(" + n + ")" );
  }

}
