public class rapperClass {
    void main(){
        byte b=2;
        Byte codeObj=Byte.valueOf(b);
        int m= 67;
        Integer myInteger=Integer.valueOf(m);
        float f=8.99f;
        Float myFloat=Float.valueOf(f);
        double d=8.99;
        Double myDouble=Double.valueOf(d);
        char j='A';
        Character myCharacter=j; //autoboxing;
        IO.println(" value of wrapper class:byte:%s,int:%d,float:%f,double:%f,char:%c".formatted(b, m, f, d, j));
       // unboxing
       float fl= myFloat;
       byte by = codeObj;
       int in = myInteger;
       double dou =myDouble;
       char ch =myCharacter;
    IO.println("unwrapper class:float:%f,byte:%s,int:%d,double:%f,char:%c".formatted(fl,by,in,dou,ch));

    }
    
}
