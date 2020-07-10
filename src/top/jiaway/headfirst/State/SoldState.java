package top.jiaway.headfirst.State;

public class SoldState implements State {
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we already give you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("OOPS,out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
