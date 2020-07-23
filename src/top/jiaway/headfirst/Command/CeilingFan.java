package top.jiaway.headfirst.Command;

public class CeilingFan {


    private final String action;

    public CeilingFan(String action) {
        this.action = action;
    }

    public void on() {
        System.out.println(action + "CeilingFan on");
    }

    public void off() {
        System.out.println(action + "CeilingFan off");
    }


}
