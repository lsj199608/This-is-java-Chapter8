public class Car {
    /*Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }*/

    //위의 주석처리 된 부분을 아래와 같이 바꿀 수 있다.
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };
    void run(){
        for(Tire tire : tires){
            tire.roll();
        }
    }
}
