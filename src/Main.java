public class Main {

  public static void out(String str) {
    System.out.println(str);
  }

  public static void out(int i) {
    System.out.println(i);
  }

  public static void out(boolean b) {
    System.out.println(b);
  }

  public static void out(Integer ii) {
    ii.equals("17");
    System.out.println(ii);

  }

  public static void main(String[] args) {
    // write your code here
    //System.out.println("Hej")
    out("hejjj");
    out(3);
    Integer i1 = Integer.valueOf(17);
    out(i1.hashCode());
    i1++;
    System.out.println("Efter i1++: ");
    out(i1);
    //out();

    Integer iii = 1;
    int n = 1;
    while (n < 0) {
      try {
        iii = iii * 1000;
        int y = iii / 0;
      } catch (Exception e) {
        out("fejl e= " + e.getMessage());
      }
      out(iii);
      n++;
    }
    out('a');

    for (int i = 97; i < 100; i++) {
      out("" + (char) i + " har ascii= " + i);
      System.out.println("https://www.google.com/search?q=ascii&oq=ascii&aqs=chrome..69i57j0i433i512j0i512l8.651244j0j7&sourceid=chrome&ie=UTF-8");

    }
    System.out.print("Hvis du har et tal fra Ascii 65021: = ");
    out("" + (char) 65021);
    System.out.print("ଜ: = ");
    out('ଜ');

    //out('ଜେନ୍');
    // out('ଜେନ୍ସ ');

  }
}
