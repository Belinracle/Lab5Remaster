package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class InfoCommand implements Command {
    private CollectionInterface coll;
    private Validator val = new Validator("Any");
    InfoCommand(CollectionInterface coll, CommandFetch cf){
        this.coll = coll;
        cf.addCommand("info",this);
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        io.writeln(coll.info());
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
