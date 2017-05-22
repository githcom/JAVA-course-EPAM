package com.tasks5.command;

/**
 * Created by AVK on 26.03.2017.
 */
public class CommandDate implements Command {


    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
