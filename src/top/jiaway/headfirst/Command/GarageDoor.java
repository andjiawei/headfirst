package top.jiaway.headfirst.Command;

public class GarageDoor {

    private final String action;

    public GarageDoor(String action) {
        this.action = action;
    }

    public void up() {
        System.out.println(action + "GarageDoor on");
    }

    public void down() {
        System.out.println(action + "GarageDoor off");
    }
}
