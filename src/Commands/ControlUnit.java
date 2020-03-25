package Commands;

import Collection.CollectionInterface;
import Collection.DeQueCollection;
import Factory.Factory;
import Factory.IOfactory;
import IO.IOconsole;
import IO.IOinterface;
import Parsers.CSVParser;
import Parsers.Parser;

import java.io.*;

public class ControlUnit {
    private CommandFetch cf;
    private IOinterface iOinterface;
    public ControlUnit(CommandFetch cf) throws IOException {
        this.cf = cf;
        CollectionInterface dmc = new DeQueCollection();
        Factory iomov = new IOfactory();
        iOinterface = new IOconsole(new InputStreamReader(System.in),new OutputStreamWriter(System.out),true);
        Command add = new AddCommand(dmc,iomov, cf);
        Command show = new ShowCommand(dmc, cf);
        Command info = new InfoCommand( dmc,cf);
        Command help = new HelpCommand(cf, "SomeFile.txt");
        Command update = new UpdateCommand(dmc,iomov,cf);
        Parser csvPars = new CSVParser();
        Command save = new SaveCommand( dmc,"Save.txt",cf,csvPars);
        Command load = new LoadCommand(dmc,csvPars,cf);
        Command remFirst = new RemoveFirstCommand(dmc, cf);
        Command removeID = new RemoveCommand(dmc,cf);
        Command clear = new ClearCommand(dmc, cf);
        Command exit = new ExitCommand(cf);
        Command addIfMax = new AddIfMaxCommand(dmc,cf,iomov);
        Command addIfMin = new AddIfMinCommand(dmc,cf,iomov);
        Command removeSc = new RemoveAllByScCommand(dmc,cf,iomov);
        Command coutByMpaaRating = new CountByMpaaCommand(dmc,cf);
        Command printAsc = new PrintAscendingCommand(dmc,cf);
        Command execute = new ExecuteCommand(cf);
    }
    public void process(String str) throws IOException {
        cf.run(str,iOinterface);
    }
}