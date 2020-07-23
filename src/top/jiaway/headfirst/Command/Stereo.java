package top.jiaway.headfirst.Command;

public class Stereo {
    public Stereo(String living_room) {

    }

    public void on() {
        System.out.println("stereo on");
    }

    public void setCD() {
        System.out.println("Stereo setCD");
    }

    public void setVolume(int i) {
        System.out.println("音量" + i);
    }

    public void off() {
        System.out.println("stereo off");
    }
}
