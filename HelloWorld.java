/**
 * A hello world program to confirm the SDK has been configured properly.
 * Also utilized to help demonstrate core SDK tools.
 *
 * @author Michael C. Han
 * @version 1.0
 */
public class HelloWorld {
        /**
         * Main method for program. All executable Java classes must
 * contain this method.
         *
         * @param args passed in from commandline
         */
        public static void main(String[] args) {
                HelloWorld helloTest = new HelloWorld();
                System.out.println(helloTest.sayHello());
                System.out.println("");
                System.out.println(helloTest.sayHi());
        }

        /**
         * Default Class constructor
         *
         */
        public HelloWorld() {
        }

        /**
         * Method to say hello to the invoker
         * @return String saying "Hello"
         */
        public String sayHello() {
                return "Hello";
        }

        /**
         * Method to say hi to the invoker
         * @return String saying "Hi!"
         */
        public String sayHi() {
                return "Hi!";
        }
}