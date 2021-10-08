public class Carfactory {
    private static Carfactory instance = new Carfactory();

    private int carNum = 10000;

    private Carfactory() {}

    public static Carfactory getInstance(){
        if( instance == null){
            instance = new Carfactory();
        }

        return instance;
    }

    public Car createCar(){
        carNum++;
        Car car = new Car(carNum);
        return car;
    }
}
