

public class HashCode {
    public static void main(String args[]) {
        Character c = new Character('a');
        System.out.println(c.hashCode());//prints out the decimal value from ascii table

        Character c2 = new Character('b');
        System.out.println(c2.hashCode());//print decimal value from ascii table

        Character c3 = new Character('*');
        System.out.println(c3.hashCode());//print decimal value from ascii table

        Integer num = 42;
        System.out.println(num.hashCode());//print the int

        Integer num2 = new Integer(101);
        System.out.println(num2.hashCode());//print the int

        String s = "ab";
        System.out.print(s.hashCode() + " = ");//prints the math in the following println statement
        System.out.println((c.hashCode() * 31) + c2.hashCode());
        //hash code of s = s[0] * (31 to the power of length-index) all the way to index = i
        //uses 31 because its a prime number and prevents collisions well

        Double d = 42.42;
        System.out.println(d.hashCode());//does dark magic
    }
}