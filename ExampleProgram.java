public class ExampleProgram {

    private int instanceVariable;

    // Constructor
    public ExampleProgram(int initialValue) {
        this.instanceVariable = initialValue;
        System.out.println("Constructor: Setting instanceVariable to " + this.instanceVariable);
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method: instanceVariable is " + this.instanceVariable);
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Static method 1: This is a static method.");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Static method 2: This is another static method.");
    }

    public static void main(String[] args) {
        // Create an instance of the class by calling the constructor
        ExampleProgram exampleInstance = new ExampleProgram(42);

        // Call the non-static method on the instance
        exampleInstance.nonStaticMethod();

        // Call the static methods directly using the class name
        ExampleProgram.staticMethod1();
        ExampleProgram.staticMethod2();
    }
}
