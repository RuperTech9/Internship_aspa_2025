package patterns.command.main;

import patterns.command.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(lightOn, lightOff, fanOn);

        remoteControl.pressButton1(); // Encender la luz
        remoteControl.pressButton2(); //Apagar la luz
        remoteControl.pressButton3(); // Activar ventilador
    }
}
