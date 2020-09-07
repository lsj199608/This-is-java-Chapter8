public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc = new RemoteControl() {//익명 구현 객체. 일회성의 구현 객체를 만든다.
            //인터페이스 변수 = new 인터페이스(){ 인터페이스에 선언된 추상 메소드의 실체 메소드 선언 };의 코드 형식이다.
            //중괄호 닫고 세미콜론 반드시 붙여야 한다.
            @Override
            public void turnOn() {
                System.out.println("rrsksksksk");
            }

            @Override
            public void turnOff() {
                System.out.println("newufiabgif");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("nfewuongiwena");
            }
        };
        rc.turnOff();
        rc.setVolume(3);
        rc = new Television();
        rc.setMute(true);
        rc.setVolume(5);
        rc.turnOff();
        RemoteControl.changeBattery();

    }
}
