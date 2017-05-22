package com.tasks5.command;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by AVK on 25.03.2017.
 */
public class Application {

    public static void main(String[] args) {

        Command cmd;

        if (args == null || args.length <= 0 || args.length > 2){
            System.out.println("Error");
        } else if (args.length == 1 && args[0] == "help"){
            cmd = new CommandHelp("Help executed");
            cmd.execute();
        } else if (args.length == 2 && args[0] == "echo"){
            cmd = new CommandEcho(args[1]);
            cmd.execute();
        } else if (args.length == 2 && args[0] == "date" && args[1] == "now"){
            cmd = new CommandDate();
            cmd.execute();
        } else if (args.length == 1 && args[0] == "exit"){
            cmd = new CommandExit("Goodbye!");
            cmd.execute();
        } else {
            System.out.println("Error");
        }

    }
}
