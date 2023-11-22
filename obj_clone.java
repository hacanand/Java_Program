package JavaProgram;
public class obj_clone implements Cloneable {
    int a=10;
    int b=15;
    //    public Object clone()  throws CloneNotSupportedException{
    //     return super.clone();
    //   } 

      public static void main(String[] args )throws  CloneNotSupportedException  {
          obj_clone obj1 = new obj_clone();
          obj_clone obj2 = (obj_clone) obj1.clone();
          System.out.println(obj1.a);
          System.out.println(obj2.a);
      
        
        
    }

    
}
