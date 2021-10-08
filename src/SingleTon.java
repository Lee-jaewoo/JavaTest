public class SingleTon {

    private static SingleTon instance = new SingleTon();

    private SingleTon() {}

    public SingleTon getInstance(){
        if( instance == null){
            instance = new SingleTon();
        }

        return instance;
    }

}
