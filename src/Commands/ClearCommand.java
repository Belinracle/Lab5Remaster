package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class ClearCommand implements Command {
    private CollectionInterface ci;
    private Validator val  = new Validator("Any");
    public ClearCommand(CollectionInterface ci, CommandFetch cf){
        cf.addCommand("clear",this);
        this.ci=ci;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        ci.clear();
        io.writeln("Коллекция очищена");
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
