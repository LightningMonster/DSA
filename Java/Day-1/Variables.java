public class Variables {
    public static void main(String[] args) {
        // Reference data type
        String s = "Yash";

        // Primitive data types
        byte b = 127;              // 1 byte, range: -128 to 127
        short sh = 32000;          // 2 bytes, range: -32,768 to 32,767
        int i = 1;                 // 4 bytes
        long l = 10000000000L;     // 8 bytes, note the 'L' at the end

        float f = 10.5f;           // 4 bytes, note the 'f' at the end
        double d = 2.00;           // 8 bytes

        char c = 'A';              // 2 bytes, holds a single character
        boolean bool = true;       // 1 bit (but JVM uses 1 byte internally)

        // Output all variables
        System.out.println("String: " + s);
        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
