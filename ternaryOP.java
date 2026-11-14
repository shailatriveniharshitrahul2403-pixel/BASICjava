public class ternaryOP {
    void main (){
        int a=8, b=9, c=6, value;
        //find the max value
        value = ((a>b) ?(a>c)? a:c:(b>c) ?b:c);
        IO.println("max number:"+value);
    }
    
}
