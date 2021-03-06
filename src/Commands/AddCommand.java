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
    private Validator val =new Validator("String,Integer");
    private String name;
    AddCommand(CollectionInterface ci,Factory fac,CommandFetch cf){
        cf.addCommand("add", this);
        this.ci = ci;
        movFac= fac;
        name="add";
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        if(val.validate(args))
        {ci.add(movFac.createMovie(io,args));
        val.movie();
        io.writeln("Спасибо, фильм добавлен в коллекцию");}
        else io.writeln("введены неверные аргументы");
    }

    @Override
    public Validator getValidator() {
        return val;
    }

    @Override
    public String getName() {
        return name;
    }
}
