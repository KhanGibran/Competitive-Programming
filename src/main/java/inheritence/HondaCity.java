package inheritence;

public class HondaCity extends Car{
    int mileage;

    HondaCity(Integer mileage){
        super(false,4);
        this.mileage = mileage;
    }

    Integer getMileage(){
        return mileage;
    }
}
