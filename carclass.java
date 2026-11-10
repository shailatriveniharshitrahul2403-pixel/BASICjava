 class Car {
    int year;
    String nameCar;
    Car(int year, String nameCar){
        this.year = year;
        this.nameCar =nameCar;
    }
    void  carObject (){
        IO.println(year +" "+ nameCar);
    }
}
 public class carclass{
void main(){
    Car myCar =new Car( 2000,"Mercidize");
    myCar.carObject();

 }
}