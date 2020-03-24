package Commands;

import Collection.MpaaRating;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Validator {
    private String validate;
    public Validator(String validate){
        this.validate=validate;
    }
    boolean validate(List<String> string){
        if (validate.equals("Int")){try{ Integer.parseInt(string.get(1));return true;}catch (NumberFormatException|IndexOutOfBoundsException e){return false;}}
        if (validate.equals("Path")){try{ new FileReader(string.get(1)).close();return true;}catch (IndexOutOfBoundsException | IOException e){return false;}}
        if (validate.equals("Rating")){try{ MpaaRating.valueOf(string.get(1));return true;}catch (IndexOutOfBoundsException |IllegalArgumentException e){return false;}}
        if (validate.equals("Any")){return true;}
        return true;
    }
}