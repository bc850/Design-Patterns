public class Singleton {
   // eagerly created instance of Singleton
   private static Singleton singleton = new Singleton();
   
   protected Singleton() {
      // Exists only to prevent instantiation
   }
   
   public static Singleton getInstance() {
      return singleton;
   }
   
   public String doSomething() {
      return "I'm a Singleton.";
   }
}