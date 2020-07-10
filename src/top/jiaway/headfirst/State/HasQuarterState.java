package top.jiaway.headfirst.State;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can not insert another quarter");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("quart return");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ... ");
        int winner = randomWinner.nextInt(10);
        // 数量为0 概率为1/10 并且糖果数>1
        if(winner == 0 && gumballMachine.getCount() >1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }


    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
