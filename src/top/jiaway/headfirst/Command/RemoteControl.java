package top.jiaway.headfirst.Command;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    // 撤销键
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setOnCommands( int slot,Command onCommand,Command offCommand ){
        onCommands[slot] = onCommand;
        offCommands[slot]= offCommand;
    }

    public void onButtonWasPushed( int slot ){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed( int slot ){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
