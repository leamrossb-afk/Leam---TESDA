public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(String display){
        System.out.println(display);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("BMW");
        car.setModel("X3");
        car.setYear(2024);
        car.setNumberOfDoors(4);

        StringBuilder sb = new StringBuilder("Car Details: " + 
            "\nMake: " + car.getMake() +
            "\nModel: " + car.getModel() +
            "\nYear: " + car.getYear() +
            "\nNumber of Doors: " + car.getNumberOfDoors());

        car.displayDetails(sb.toString());
    }
}
