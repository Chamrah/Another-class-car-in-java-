// This is a class
public class Main {
// Function that which contains an arguments
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.nameCar = "Toyota";
        car1.speed = 240;
        car1.enginePower = 80;
        car1.Color = "Black";

// Presentation of the car
        System.out.println(car1.nameCar);
        System.out.println(car1.nameCar +" have "+ car1.speed+ " KM/H in speed");
        System.out.println(car1.nameCar +" have "+car1.enginePower+" in engine power");
        System.out.println(car1.nameCar +" have a color "+ car1.Color);

// Method to do in this car
        car1.Start();
        car1.ChangeGear();
        car1.Stop();
    }
}