//Creating class
public class _01_create_class {       //class is created
    public static void main(String[] args){
      
      System.out.println("Hello Divya");
      System.out.println("Lets create the object");
      _01_create_class obj = new _01_create_class(); //creating an object
      System.out.println("object created and we will call the method using object");
      obj.method(); //calling the method with object
      //In the similar way we can create many objects and call the methods
      System.out.println("Hurry!! Method called using object");
    }

    void method(){
      System.out.println("\"Its a method\"");
    }
}
