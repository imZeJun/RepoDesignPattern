package com.demo.zejun.repodesignpattern.behavioralpattern.commandpattern;

public class Invoker {

    public Command mCommand;

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void action() {
        if (mCommand != null) {
            mCommand.execute();
        }
    }
}
