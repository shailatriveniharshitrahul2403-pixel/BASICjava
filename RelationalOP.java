public class RelationalOP {
    void main(){
        // how to compare
        int x=89;
        int  y=67;
        int z=45;
        IO.println("""
            x>y:%b%n y<x:%b%n z>y:%b%n z<y:%b%n x==y:%b%n x!=y:%b%n
            """.formatted(x > y, y < x, z > y, z < y, x == y, x != y));
    }
    
}
