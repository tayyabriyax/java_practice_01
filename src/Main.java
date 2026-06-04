public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Explicit Type Casting
        int num1 = 500;
        byte num2;
        num2 = (byte) num1;
        System.out.println(num2);

        char char1 = 'A';
        int charUnicode;
        charUnicode = char1;
        System.out.println("The unicode of char 'A' is " + charUnicode);
    }
}