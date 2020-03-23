package Collection;

import IO.IOinterface;
import Parsers.Parser;

public class DeQueCollection implements CollectionInterface {
    public DeQueCollection(){

    }
    @Override
    public String info() {
        return null;
    }

    @Override
    public String show() {
        return null;
    }

    @Override
    public void add(Movie movie) {

    }

    @Override
    public void update(Long id, IOinterface iOinterface) {

    }

    @Override
    public void remove_by_id(Long id, IOinterface iOinterface) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void remove_first(IOinterface iOinterface) {

    }

    @Override
    public void add_if_max(Movie movie, IOinterface io) {

    }

    @Override
    public void add_if_min(Movie movie, IOinterface io) {

    }

    @Override
    public void remove_all_by_screenwriter(Person pers, IOinterface io) {

    }

    @Override
    public long count_by_mpaa_rating(MpaaRating rating) {
        return 0;
    }

    @Override
    public String print_ascending() {
        return null;
    }

    @Override
    public String save(Parser pars, IOinterface iOinterface) {
        return null;
    }
}
