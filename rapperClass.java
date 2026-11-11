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
        IO.println("byte:%s,int:%d,float:%f,double:%f,char:%c".formatted(b, m, f, d, j));

    }
    
}
