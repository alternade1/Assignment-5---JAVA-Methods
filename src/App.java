public class App {
    public static void main(String[] args) throws Exception {
            // Test the methods with an example value
            int testValue = 10;
    
            // ######################### Method 1 #########################
            // This should print "The result is: 11"
            // This method does not return anything, so we don't need to store the result
            addOnePrint(testValue);
    
            // ######################### Method 2 #########################
            // This should store the number 11 in y
            int y = addOneReturn(testValue);
            // Once we store the result in y, we can print it.
            System.out.println("Returned value stored in y: " + y);
    
            // ######################### Method 3 #########################
            // This should print "The result is: 11" and also store the number 11 in z, please note that the result will print twice
            int z = addOneComprehensive(testValue);
            System.out.println("Returned value stored in z: " + z);
        }
    
        // ************************* Instructions *************************
        // You have been given a class with three methods.  Each method takes an integer as input and returns an integer.
    
        
        // ######################### Methods #########################
        // You need to implement the following methods, which have already been declared for you
    
        // ######################### Method 1 #########################
        // Adds one to the given number and PRINTS the result
        public static void addOnePrint(int x) {
            // Add your implementation here
            int addOne = 1;
            System.out.println(x + addOne);
            // Step 1: Add one to x
            // Step 2: print the result
        }
     
        // ######################### Method 2 #########################
        // Adds one to the given number and RETURNS the result
        public static int addOneReturn(int y) {
            // Add your implementation here
            int addOne = 1;
            System.out.println(y + addOne);
            // Step 1: Add one to x
            // Step 2: return the result (instead of printing it) using the return statement below
            return 11; // Placeholder return statement.  Change this to return the correct result
        }
    
        // ######################### Method 3 #########################
        // Adds one to the given number, prints AND returns the result
        public static int addOneComprehensive(int z) {
            // Add your implementation here
            int addOne = 1;
            System.out.println(z + addOne);
            // Step 1: Add one to x
            // Step 2: print the result
            // Step 3: return the result using the return statement below
            return 11; // Placeholder return statement.  Change this to return the correct result
        }
    }
    

