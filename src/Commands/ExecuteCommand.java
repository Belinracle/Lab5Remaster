package Commands;

import IO.IOconsole;
import IO.IOinterface;

import java.io.*;
import java.util.List;

public class ExecuteCommand implements Command {
    private Validator val = new Validator("Path");
    private CommandFetch cf;
    private IOinterface nio;
    ExecuteCommand(CommandFetch cf){
        cf.addCommand("execute",this);
        this.cf=cf;
    }
    @Override
    public void execute(IOinterface io, List<String> args) throws IOException {
        try {
            if (val.validate(args)) {
                nio = new IOconsole(new InputStreamReader(new FileInputStream(new File(args.get(1)))), new OutputStreamWriter(System.out), false);
                while (nio.hasNextLine()) {
                    String str = nio.readLine();
                    if (!str.isEmpty()) {
                        cf.run(str, nio);
                    }
                }
            } else io.writeln("Неверные аргументы команды, возмоно указан неверный файл");
        }catch (IOException|IllegalArgumentException e){
            io.write("Скрипт неправильный");
        }
    }

    @Override
    public Validator getValidator(){
        return val;
    }
}
