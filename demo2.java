public class demo2 {
    public static void main(String[] args) {
        // integral literal
        int a=012;    // in octal
        int b=12;
        int c=0xab;
        int d=0b11111;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toOctalString(56));
        System.out.println(Integer.toHexString(d));
        int f=0x123abcd;
        double e=f;
        System.out.println(f);
        System.out.println(e);
        // in java every integral literal is of int type
        // in java every floating point literal is of double type
         float g=123.789f; // float g=123.789; will show error but
        // floating literal
         float h = (float) 123.789;
         int a1=12;
         short b1=23;
         byte s1=34;
         int d2= a1+b1+s1; // correct but writing it like byte d2= a1+b1+s1; or short d2= a1+b1+s1; will show an error but we can write it as
        byte d3= (byte)(a1+b1+s1); // is correct
        char ch1= '\u1F49';   // character literal
        System.out.println(ch1);
    }
}
