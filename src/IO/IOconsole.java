package IO;

import java.io.*;
import java.util.Scanner;

public class IOconsole implements  IOinterface {
    private Reader in;
    private Writer out;
    private Scanner scan;
    private boolean interactive;
    public IOconsole(Reader in, Writer out,boolean interactive){
        this.interactive = interactive;
        this.in=in;
        this.out = out;
        scan = new Scanner(in);
    }
    @Override
    public void write(String str){
        try {
            out.write(str);
            out.flush();
        }catch (IOException e){
            write(e.getMessage());
        }
    }

    @Override
    public void writeln(String str){
        write(str+"\n");
    }

    @Override
    public String readLine() throws IOException {
        return scan.nextLine();
    }

    @Override
    public boolean hasNext(){
        return scan.hasNextLine();
    }

    @Override
    public boolean isInteractive() {
        return interactive ;
    }
}
