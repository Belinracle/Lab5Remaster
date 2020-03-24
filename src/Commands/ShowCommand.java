package Commands;


import Collection.CollectionInterface;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class ShowCommand implements Command {
    private CollectionInterface coll;
    private Validator val = new Validator("Any");
    ShowCommand(CollectionInterface coll,CommandFetch cf){
        this.coll=coll;
        cf.addCommand("show",this);
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        io.write(coll.show());
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
