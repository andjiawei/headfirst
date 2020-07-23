package top.jiaway.headfirst.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println( "NO Command" );
    }

    @Override
    public void undo() {
        System.out.println( "undo NO Command" );
    }
}
