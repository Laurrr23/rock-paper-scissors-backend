package ro.jlgacademy.project;

import java.util.List;

public interface GameRepository {

    void save(final Game game);
    List<Game>getAll();
    void delete(final String gameId);
}
