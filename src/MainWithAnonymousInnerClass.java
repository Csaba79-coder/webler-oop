public class MainWithAnonymousInnerClass {

    // in Spring command line runner or application runner !!!
    public static void main(String[] args) {

        // Creating an anonymous inner class that implements the Runnable interface
        Runnable runnable = new Runnable()  {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class.");
            }
        };

        // Using the anonymous inner class to create a thread

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
