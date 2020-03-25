package Commands;

import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class ExitCommand implements Command {
    private Validator val = new Validator("Any");
    ExitCommand(CommandFetch cf){
        cf.addCommand("exit",this);
    }

    @Override
    public void execute(IOinterface io, List<String> args) {
        System.exit(0);
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}

