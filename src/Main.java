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
  public static void out(Class cls) {
    System.out.println(cls);
    System.out.println(cls.getClass());
    var obj = cls.getClass();
    Class objj = cls.getClass();
    System.out.println(objj);
  }

  public static void out(String ...str){
    var obj = str;
  }

  public static void out(Student std){
     String className = std.getClass().getName();
     String hashCodxinr = Integer.toHexString(std.hashCode());
     var obj = Integer.toHexString(std.hashCode());
     out(className + " @: = " + hashCodxinr);
  }

  public static void main(String[] args) {
    Student student = new Student();
    out(student);
    System.out.println(student);



  }
}

