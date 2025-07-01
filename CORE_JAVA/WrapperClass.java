public class WrapperClass {
    public static void main(String[] args) {
        int num=8; //int, double, float etc. are primitive data type

        Integer num1= new Integer(num); //boxing --making primitive data to reference data type
        Integer num2=num;               //autoboxing --auto primitive data to reference data type

        int num3= num2.intValue();    //unboxing --Reference type to primitive type
        num3=num2;                    //auto-unboxing -- auto Reference type to primitive type
        System.out.println(num3);
        String str="12";
        //System.out.println(str*2); //it won't work

        Integer num4= Integer.parseInt(str);

        System.out.println(num4*2); //now it works

        /**********************************************************************
         * Integer
         * Double
         * String
         * etc. are Wrapper class, because it wrape primitive data type
         *********************************************************************/
    }
}
