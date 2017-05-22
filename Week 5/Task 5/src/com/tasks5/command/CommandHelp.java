package com.tasks5.command;

/**
 * Created by AVK on 25.03.2017.
 */
public class CommandHelp implements Command {

    String string;

    public CommandHelp(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(string);;
    }
}
