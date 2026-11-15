public class instanceouOF {
    void main(){
        String str="my name is John";
        Object myObject =17;
        IO.println("  %b%n %b%n  %s%n".formatted(str instanceof String,myObject instanceof Integer,myObject instanceof String));
    }
    
}
