public class Anonymous {
    interface Greeting {
        void sayHello();
    }
    

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class");
            }
        };
        greeting.sayHello();
    }
}
