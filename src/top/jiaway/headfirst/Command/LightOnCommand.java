package top.jiaway.headfirst.Command;

// 封装的任何命令 都实现 Command接口 按下遥控器按钮 直接执行execute
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
