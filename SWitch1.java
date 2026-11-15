public class SWitch1 {
    void main(){
        String myString;

        int weekDay=89;
        switch (weekDay) {
            case 1:
                myString ="monday";
                break;
                case 2:
                    myString="tuesday";
                    break;
                    case 3:
                    myString ="wednesday";
                    break;
                    case 4:
                        myString="thrusday";
                        break;
                        case 5:
                            myString ="friday";
                            break;
                            case 6:
                                myString= "saterday";
                                break;
                           case 7:
                            myString="sunday";
                            break;
            default:
                myString="invalid";
                
                
        }
            
       IO.println(myString); 

    }
    
}
