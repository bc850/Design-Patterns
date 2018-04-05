public class SingletonWrapper {
   
   // A better way to use the eagerly created Singleton approach
   // is to define the Singleton as a static inner class and employ 
   // the enclosing class (SingletonWrapper) to retrieve the 
   // instance. This has the benefit that inner classes are not loaded 
   // until they are referenced. Thus, perhaps we shouldn’t say 
   // “eagerly created.”
   
   private static class Singleton {
      public static final Singleton singleton = new Singleton();
      
      public String doSomething() {
         return "I'm a Singleton.";
      }
   }
   
   public static Singleton getInstance() {
      return Singleton.singleton;
   }
   
   public static void main(String args[]) {
      Singleton s = SingletonWrapper.getInstance();
      System.out.println(s.doSomething());
   }
}