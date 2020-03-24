package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;
import Parsers.Parser;

import java.io.IOException;
import java.util.List;

public class SaveCommand implements Command {
    private Validator val = new Validator("Any");
    private CollectionInterface ci;
    private IOinterface file;
    private Parser parser;
    public SaveCommand(CollectionInterface ci, IOinterface file,CommandFetch cf, Parser parser){
        this.ci=ci;
        this.file= file;
        this.parser=parser;
        cf.addCommand("save",this);
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        ci.save(parser,file);
        io.writeln("Коллекция сохранена");
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
