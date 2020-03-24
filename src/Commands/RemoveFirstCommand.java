package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class RemoveFirstCommand implements Command {
    private CollectionInterface coll;
    private Validator val = new Validator("Any");
    RemoveFirstCommand(CollectionInterface coll, CommandFetch cf){
        cf.addCommand("remove_first",this);
        this.coll = coll;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        coll.remove_first(io);
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
