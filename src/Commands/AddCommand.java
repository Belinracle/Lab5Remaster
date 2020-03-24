package Commands;

import Collection.CollectionInterface;
import Collection.Movie;
import Factory.Factory;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public class AddCommand implements Command {
    private CollectionInterface ci;
    private Factory movFac;
    private Validator val =new Validator("Any");
    AddCommand(CollectionInterface ci,Factory fac,CommandFetch cf){
        cf.addCommand("add", this);
        this.ci = ci;
        movFac= fac;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        ci.add(movFac.createMovie(io,args));
        io.writeln("Спасибо, фильм добавлен в коллекцию");
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
