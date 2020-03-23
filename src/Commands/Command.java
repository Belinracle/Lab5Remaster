package Commands;

import Collection.CollectionInterface;
import IO.IOinterface;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public interface Command {
    void execute(IOinterface io, String[] args, CollectionInterface colInt);
}
