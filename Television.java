public class Television implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() { //인터페이스의 모든 메소드는 public이므로 더 낮은 접근 제한으로 작성할 수 없다.
        //추상메소드에 대응하는 실체 메소드를 구현 클래스가 작성하지 않으면 구현 클래스는 자동적으로 추상클래스가 된다.
        //따라서 실체 메소드를 작성하지 않는다면 클래스 선언부에 abstract 키워드를 추가해야 한다.
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) { //setVolume의
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : "+this.volume);
    }
}
