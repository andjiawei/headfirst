package top.jiaway.headfirst.Proxy;

import top.jiaway.headfirst.State.NoQuarterState;
import top.jiaway.headfirst.State.State;
import top.jiaway.headfirst.State.*;

public class GumballMachine extends top.jiaway.headfirst.State.GumballMachine {

    State soldState; // 售出糖果
    State soldOutState; // 售完
    State noQuarterState;// 无硬币状态
    State hasQuarterState;// 有硬币

    State state = soldOutState;
    int count = 0;

    State winnerState;

    String location;


    public GumballMachine(String location,int numberGumballs) {
        super(numberGumballs);
        this.location = location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    /**
     * 释放糖果的辅助方法
     */
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot ...");
        if(count != 0){
            count = count - 1;
        }

    }


    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;

    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String getLocation() {

        return location;
    }

    public State getState() {

        return state;
    }
}
