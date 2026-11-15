public class BitwiseOP {
    void  main(){
        int a=0b1010;
        int c=0b001;
        IO.println("a&c:%d%n a|c:%d%n a^c:%d%n ~a:%d%n a<<2:%d%n c>>1:%d%n".formatted(a&c,a|c,a^c,~a,a<<2,c>>1));
    }
    
}
