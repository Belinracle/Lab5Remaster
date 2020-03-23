package IO;

import java.io.*;
import java.util.Scanner;

public class IOconsole implements  IOinterface {
    Scanner in;
    BufferedWriter out;
    public IOconsole(){
        in= new Scanner(System.in);
        out = new BufferedWriter(new OutputStreamWriter(System.out));
    }
    @Override
    public void write(String str) throws IOException {
        out.write(str);
        out.flush();
    }

    @Override
    public void writeln(String str) throws IOException {
        write(str+"\n");
    }

    @Override
    public String readLine() {
        return in.nextLine();
    }

    @Override
    public boolean hasNext() {
        return in.hasNextLine();
    }
}
