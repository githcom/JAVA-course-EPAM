package com.tasks5.command;

/**
 * Created by AVK on 26.03.2017.
 */
public class CommandExit implements Command {
    String string;

    public CommandExit(String string) {
        this.string = string;
    }


    @Override
    public void execute() {
        System.out.println(string);
    }
}
