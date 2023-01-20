package ro.jlgacademy.project;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@AllArgsConstructor
public class GameRepositoryImpl implements GameRepository{
    private MongoTemplate mongoTemplate;
    @Override
    public void save(final Game game) {
        this.mongoTemplate.save(game);
    }

    @Override
    public List<Game> getAll() {
        return this.mongoTemplate.findAll(Game.class);
    }

    @Override
    public void delete(final String gameId) {
       final Query query = new Query();
       query.addCriteria(Criteria.where("_id").is(gameId));
       this.mongoTemplate.remove(query,Game.class);
    }
}
