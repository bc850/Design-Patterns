public class SingletonTester {
   public static void main(String args[]) {
      Singleton singleton = Singleton.getInstance();
      System.out.println(singleton.doSomething());
   }
}