public class SmartTelevision implements RemoteControl, Searchable{ //다중 인터페이스
    //다중 인터페이스를 구현할 경우 모든 인터페이스의 추상 메소드에 대해 실체 메소드를 작성해야 함.
    //하나라도 없을 시 추상클래스로 선언해야함.
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV킴");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끔");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : "+this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
