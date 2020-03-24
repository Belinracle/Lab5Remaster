import Collection.MpaaRating;
import Commands.CommandFetch;
import Commands.ControlUnit;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        CommandFetch cf = new CommandFetch();
        ControlUnit cu = new ControlUnit(cf);
        while(true) {
            cu.process(scan.nextLine());
        }
    }
}
