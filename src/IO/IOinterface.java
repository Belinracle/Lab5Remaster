package IO;

import java.io.IOException;

public interface IOinterface {
    void write(String str) throws IOException;
    void writeln(String str) throws IOException;
    String readLine() throws IOException;
    boolean hasNextLine() throws IOException;
    boolean isInteractive();
    Object read();
    void close() throws IOException;
}
