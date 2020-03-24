package IO;

import java.io.IOException;

public interface IOinterface {
    void write(String str) throws IOException;
    void writeln(String str) throws IOException;
    String readLine() throws IOException;
    boolean hasNext() throws IOException;
    boolean isInteractive();
}
