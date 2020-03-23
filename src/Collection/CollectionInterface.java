package Collection;

import java.util.Collection;

public interface CollectionInterface {
    String info();
    String show();
    void add(Movie movie);
    void update(Long id);
    void remove_by_id(Long id);
    void clear();
    Collection getColl();
    void remove_first();
    void add_if_max(Movie movie);
    void add_if_min(Movie movie);
    void remove_all_by_screenwriter(Person pers);
    long count_by_mpaa_rating(MpaaRating rating);
    String print_ascending();
}
