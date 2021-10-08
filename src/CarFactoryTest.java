public class CarFactoryTest {

    public static void main(String[] args) {

        Carfactory factory = Carfactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());    //10001 출력
        System.out.println(yourSonata.getCarNum());    //10001 출력
    }
}
