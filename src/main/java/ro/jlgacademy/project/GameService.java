package ro.jlgacademy.project;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class GameService {

    private GameRepository repository;

    public void save(final GameDto dto){
        final Game game = new Game(UUID.randomUUID().toString(),dto.getChoice(),dto.getComputerChoice(), dto.getComputerScore(),dto.getUserScore(),Result.valueOf(dto.getResult()));

            this.repository.save(game);
    }

    public List<Game>getAll(){
       return this.repository.getAll();
    }
    public void delete(final String gameId){
        this.repository.delete(gameId);
    }

}
