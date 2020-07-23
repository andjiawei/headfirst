package top.jiaway.headfirst.Command;

public class RemoteControlTest {

    public static void main(String[] args) {

        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 灯
        Light light = new Light("灯");
        // 把开灯的动作封装为对象
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();


    }


}
