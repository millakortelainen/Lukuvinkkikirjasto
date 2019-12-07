package ui;

import logic.Logic;
import io.IO;
import io.Network;

public class Textual {
    
    private IO io;
    private CommandFactory commandFactory;
    
    public Textual(Logic logic, IO io, Network networkCon) {
        this.commandFactory = new CommandFactory(io, logic, networkCon);
        this.io = io;
    }
    
    public void run() {
        io.print("Welcome to Lukuvinkkikirjasto.");
        
        String command = null;
        
        while (true) {    
            commandFactory.getDefaultObject().printSupportedCommands();
            
            command = io.askUser("Give command");
            command = command.toLowerCase();
            
            io.print("");
            
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            
            commandFactory.getCommand(command).handleCommand();
        }
        
        io.print("");
        io.print("Exiting!..");
    }
    
}
