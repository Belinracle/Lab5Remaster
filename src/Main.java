import Collection.MpaaRating;
import Commands.CommandFetch;
import Commands.ControlUnit;
import IO.IOconsole;
import IO.IOinterface;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        CommandFetch cf = new CommandFetch();
        ControlUnit cu = new ControlUnit(cf);
        while(true) {
            try {
                cu.process(scan.nextLine());
            }catch (StackOverflowError e){
                System.out.println("Сломал компудахтер своей рекурсией, ты доволеннн????");
            }
        }
    }
}
