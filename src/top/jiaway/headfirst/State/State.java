package top.jiaway.headfirst.State;

public interface State {

    /**
     * 放入硬币
     */
    void insertQuarter();

    /**
     * 退出硬币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();

}
