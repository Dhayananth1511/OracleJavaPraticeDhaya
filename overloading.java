class A{}
class B extends A{}

public class overloading {
    public void m(Integer o, Object i){
        System.out.println("1");
    }
    public void m(Object i, Object o){
        System.out.println("2");
    }
    public static void main(String[] args) {
        overloading o=new overloading();
        o.m(null,null);
    }
}
