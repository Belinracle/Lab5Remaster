package Commands;

import Collection.CollectionInterface;
import Factory.Factory;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class RemoveCommand implements Command {
    private CollectionInterface ci;
    private Validator val = new Validator("Int");
    RemoveCommand(CollectionInterface coll, CommandFetch cf){
        cf.addCommand("remove_by_id",this);
        ci=coll;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        if (val.validate(args)){
            ci.remove_by_id(Integer.parseInt(args.get(1)),io);
        }
        else io.writeln("Неверные аргуметы команды");
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
