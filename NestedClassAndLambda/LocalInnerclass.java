public class LocalInnerclass {
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }
        
        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        LocalInnerclass outer = new LocalInnerclass();
        outer.outerMethod();
    }
    
}
