//give example for lambda 
interface ILambda {

    void Hello();
    default void f()
    {
        System.out.println("f");
    }
}
public class Lambda {

    public static void main(String[] args) {
        //Anonymous class 
        ILambda j=new ILambda() {
            public void Hello()
            {
                 System.out.println("Hello Anonymous");
                 f();
            }
        };
        //Lambda expression
        ILambda i=() -> System.out.println("Hello");
        i.Hello();
        j.Hello();

    }
    
}