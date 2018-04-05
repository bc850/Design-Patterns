public class Singleton {
   private static Singleton singleton = null;
   
   private Singleton() {
      // Exists only to prevent instantiation
   }
   
   // double-checked locking
   // prevents multi-threaded programs from 
   // instantiating > 1 instances of Singleton
   
   public static Singleton getInstance() {
      if(singleton == null) {
         synchronized(Singleton.class) {
            if(singleton == null) {
               singleton = new Singleton();
            }
         }
      }
      
      return singleton;
   }
   
   public String doSomething() {
      return "I'm a Singleton.";
   }
}