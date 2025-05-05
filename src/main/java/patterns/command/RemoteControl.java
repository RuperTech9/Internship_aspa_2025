package patterns.command;

public class RemoteControl {
    private Command button1;
    private Command button2;
    private Command button3;

    public void setCommands(Command b1, Command b2, Command b3) {
        this.button1 = b1;
        this.button2 = b2;
        this.button3 = b3;
    }

    public void pressButton1() {
        button1.execute();
    }

    public void pressButton2() {
        button2.execute();
    }

    public void pressButton3() {
        button3.execute();
    }
}
