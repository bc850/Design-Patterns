public class Singleton {
   private static Singleton instance = null;
   
   private Singleton() {
      // Exists only to prevent instantiation
   }
   
   // Lazy Instantiation b/c Singleton instance is only
   // made once it needs to be made. This way it doesn't
   // occupy memory until the program creates it. 
   
   public static Singleton getInstance() {
      if(instance == null) {
         instance = new Singleton();
      }
      
      return instance;
   }
   
   public String doSomething() {
      return "I'm a Singleton.";
   }
}