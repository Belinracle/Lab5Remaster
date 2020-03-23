package Collection;

import IO.IOinterface;
import Parsers.Parser;

import java.util.Collection;

public interface CollectionInterface {
    String info();
    String show();
    void add(Movie movie);
    void update(Long id, IOinterface iOinterface);
    void remove_by_id(Long id, IOinterface iOinterface);
    void clear();
    void remove_first(IOinterface iOinterface);
    void add_if_max(Movie movie, IOinterface io);
    void add_if_min(Movie movie, IOinterface io);
    void remove_all_by_screenwriter(Person pers, IOinterface io);
    long count_by_mpaa_rating(MpaaRating rating);
    String print_ascending();
    String save(Parser pars, IOinterface iOinterface);
}
