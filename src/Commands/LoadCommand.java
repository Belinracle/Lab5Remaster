package Commands;

import Collection.CollectionInterface;
import IO.IOconsole;
import IO.IOinterface;
import Parsers.Parser;

import java.io.*;
import java.util.List;

public class LoadCommand implements Command {
    private Validator val = new Validator("Path");
    private CollectionInterface ci;
    private Parser pars;
    LoadCommand(CollectionInterface ci, Parser pars, CommandFetch cf){
        cf.addCommand("load",this);
        this.ci = ci;
        this.pars=pars;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        try {
            if (val.validate(args)) {
                IOinterface ioFile = new IOconsole(new InputStreamReader(new FileInputStream(new File(args.get(1)))), new OutputStreamWriter(System.out), true);
                ci.load(pars,ioFile);
                io.writeln("Коллекция загружена");
            } else io.writeln("Неверные аргументы команды(Указан неверный файл)");
        }catch (NumberFormatException e){
            io.writeln("В файле нет объектов, загружена пустая коллекция");
        }
    }

    @Override
    public Validator getValidator() {
        return val;
    }
}
