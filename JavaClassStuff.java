import java.time.LocalDateTime;
import java.util.Stack;

class JavaClassStuff {
  public static void main(String[] args) {
    Object o = new Cat("Francis");
    String s = new String("string");

    System.out.println("s.length(): " + s.length());
    if (s.equals("string")) {
      System.out.println("The strings are equal");
    }

    if (s == "string") {
      System.out.println("The strings are equal");
    }

    double pi = Double.parseDouble("3.1415");
    String piString = String.valueOf(pi);

    s = new String("cat");

    System.out.println("It is now: " + LocalDateTime.now());


    Stack<Integer> intStack = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      intStack.push(new Integer(i));
    }
    while(!intStack.empty()) {
      System.out.println(intStack.pop());
    }

    Stack<String> strStack = new Stack<String>();
    for (int i = 0; i < 10; i++) {
      strStack.push(String.valueOf(i) + String.valueOf(i));
    }
    while(!strStack.empty()) {
      System.out.println(strStack.pop());
    }
  }
}
