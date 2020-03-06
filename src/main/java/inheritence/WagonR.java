package inheritence;

public class WagonR extends Car {
    int mileage;

    WagonR(Integer mileage){
        super(false,4);
        this.mileage = mileage;
    }

    Integer getMileage(){
        return mileage;
    }
}
