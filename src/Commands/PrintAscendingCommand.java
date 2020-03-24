package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class PrintAscendingCommand implements Command {
    private Validator val = new Validator("Any");
    private CollectionInterface ci;
    PrintAscendingCommand(CollectionInterface ci, CommandFetch cf){
        cf.addCommand("print_ascending",this);
        this.ci=ci;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        io.writeln(ci.print_ascending());
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
