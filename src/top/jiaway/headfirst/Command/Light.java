package top.jiaway.headfirst.Command;

public class Light {

    private final String action;

    public Light(String action) {
        this.action = action;
    }

    public void on() {
        System.out.println(action + "开灯on");
    }

    public void off() {
        System.out.println(action + "关灯off");
    }

}
