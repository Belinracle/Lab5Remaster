package Commands;
import IO.IOinterface;

import java.io.IOException;
import java.util.List;

public interface Command {
    void execute(IOinterface io, List<String> args) throws IOException;
    Validator getValidator();
}
