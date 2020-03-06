package inheritence;

public class InnovaCrysta extends Car{

    int mileage;

    InnovaCrysta(Integer mileage){
        super(true,4);
        this.mileage = mileage;
    }

    Integer getMileage(){
        return mileage;
    }

}
