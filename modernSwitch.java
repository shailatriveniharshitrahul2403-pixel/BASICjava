public class modernSwitch {
    void main(){
        int weekDay=5;
        String myString = switch(weekDay){
        case 1 ->"sunday";
        case 2 ->"monday";
        case 3 ->"tuesday";
        case 4 ->"wednesday";
        case 5 ->"Thursday";
        case 6 ->"friday";
        case 7->"saterday";
        default->"invalid";
    
            };
            IO.println("myString:"+myString);
    
    }
}