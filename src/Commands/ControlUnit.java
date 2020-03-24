package Commands;

import Collection.CollectionInterface;
import Collection.DeQueCollection;
import Factory.Factory;
import Factory.IOfactory;
import IO.IOconsole;
import IO.IOinterface;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
//        Command update = new UpdateIDCommand(cf, dmc);
//        IDFactory idFac = new IDFactory("IdContainer.txt");
//        Command save = new SaveCommand(idFac, cf,dmc);
//        Command load = new LoadCommand(cf, fw, dmc);
//        Command remFirst = new RemoveFirstComman(dmc, cf);
//        Command removeID = new Remove_by_idCommand(cf, dmc);
//        Command clear = new ClearCommand(dmc, cf);
//        Command exit = new ExitCommand(cf);
//        Command addIfMax = new AddIfMaxCommand(dmc,cf);
//        Command addIfMin = new AddIfMinCommand(dmc,cf);
//        Command removeSc = new RemoveAllByScCommand(dmc,cf);
//        Command coutByMpaaRating = new CountByMpaaRating(dmc,cf);
//        Command printAsc = new PrintAscendingCommand(dmc,cf);
//        Command execute = new ExecuteScriptCommand(cf,dmc);
    }
    public void process(String str) throws IOException {
        cf.run(str,iOinterface);
    }
}