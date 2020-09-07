public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상메소드
    public abstract void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 메소드
    default void setMute(Boolean mute){
        if(mute){
            System.out.println("무음 처리");
        }else{
            System.out.println("무음 해제");
        }
    }

    //정적 메소드
    public static void changeBattery(){
        System.out.println("건전지를 교환");
    }
}
