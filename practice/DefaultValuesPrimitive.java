package practice;

class DefaultValuesPrimitive{
    byte defaultValByte;
    short defaultValShort;
    int defaultValInt;
    long defaultValLong;
    float defaultValFloat;
    double defaultValDouble;
    boolean defaultValBoolean;
    char defaultValChar;

    public static void main(String arg[]){
        DefaultValuesPrimitive obj = new DefaultValuesPrimitive();
        System.out.println(obj.defaultValByte);
        System.out.println(obj.defaultValShort);
        System.out.println(obj.defaultValInt);
        System.out.println(obj.defaultValLong);
        System.out.println(obj.defaultValFloat);
        System.out.println(obj.defaultValDouble);
        System.out.println(obj.defaultValBoolean);
        System.out.println(obj.defaultValChar);
    }
}


//Output:
/*
0
0
0
0
0.0
0.0
false
      //Empty Space
*/ 