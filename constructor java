public class Motorcycle {
    //properties
    private String make;
    private String model;
    private int year;
    private String color;
    private int engineSize;
    private int speed;
    private int maxGears;
    private int gear;

    public Motorcycle(String make, String model, int year, String color, int engineSize, int maxGears) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.maxGears = maxGears;
    }
        //actions
    public void speedUp(){
        int maxSpeed = 0;
        switch (gear){
            case 0:
                maxSpeed = 0;
            break;
            case 1:
                maxSpeed = 60;
            break;
            case 2:
                maxSpeed = 150;
            break;
            case 3:
                maxSpeed = 250;
            break;
        }
        if(speed < maxSpeed){
            speed += 10;
            System.out.println("The current speed is " + speed);
        }else{
            System.out.println("You are at the max speed");
        }
    }
    public void slowDown(){
        if(speed > 0){
            speed -= 10;
            System.out.println("The current speed is " + speed);
        }else{
            speed = 0;
            System.out.println("You are not moving");
        }
    }

    public void gearUp(){
        if(gear < maxGears){
            gear++;
            System.out.println("Your current gear is " + gear);
        }
        else{
            System.out.println("You are at the highest gear");
        }
    }

    public void gearDown(){
        if(gear >= 1){
            gear--;
            System.out.println("Your current gear is " + gear);
        }
        else{
            System.out.println("You are in neutral");
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public void setMaxGears(int maxGears) {
        this.maxGears = maxGears;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String toString(){
        return color + " " + make + " " + model;
    }
}
