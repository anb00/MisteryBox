package anicolau.data;




class Demo {
    protected int val;
    double dval;
    boolean bval;
    char cval;
}
public class UseDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.val = 19000;
        obj.dval = 2000;
        obj.bval = true;

       obj.cval = 8888 ;
        System.out.println("The value is "+obj.val);
        System.out.println("The value is "+obj.dval);
        System.out.println("Is in Stock; "+obj.bval);
        System.out.println("There are"+obj.cval+"in Stock Right Now!");
        System.out.println("There are"+obj.cval+"in Stock Right Now!");
        System.out.println("There are"+obj.cval+"in Stock Right Now!");






    }
}
