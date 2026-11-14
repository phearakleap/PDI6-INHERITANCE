public class exercise1 {
    public static void main(String[] args){
        Vehicle v = new Vehicle("Mercedes", 2022);
        Car miata = new Car("Miata", 1996, 2);

        v.start();
        miata.start(); miata.honk();
    }
}

class Vehicle{
    private String brand;
    private int year;

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        System.out.println("Your car has started!");
        System.out.printf("Car Brand: %s, Year: %d\n", brand, year);
    }
}

class Car extends Vehicle{
    
    private int num_doors;

    Car(String brand, int year, int num_doors){
        super(brand, year);
        this.num_doors = num_doors;
    }

    public void honk(){
        System.out.println("Honk!");
        System.out.printf("Number of doors on your car: %d\n", num_doors);
    }
}