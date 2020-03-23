package IO;

import java.io.IOException;

public interface IOinterface {
    void write(String str) throws IOException;
    void writeln(String str) throws IOException;
    String readLine();
    boolean hasNext();
}
