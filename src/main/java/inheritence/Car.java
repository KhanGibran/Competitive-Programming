package inheritence;

public abstract class  Car {

    boolean isSedan;
    int seats;

    Car(boolean isSedan,int seats){
        this.isSedan = isSedan;
        this.seats = seats;
    }
    boolean getIsSedan(){
        return isSedan;
    }
    int getSeats(){
        return seats;
    }
    abstract Integer getMileage();

    void print(String carName){
        if(!this.getIsSedan()){
            System.out.println("A "+carName+" is not Sedan, is "+this.getSeats()+"-seater, and has a mileage of around "+this.getMileage()+ " kmpl.");
        }
        else{
            System.out.println("A "+carName+" is not Sedan, is "+this.getSeats()+"-seater, and has a mileage of around "+this.getMileage()+ " kmpl.");
        }
    }
}
