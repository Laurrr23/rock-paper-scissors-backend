package ro.jlgacademy.project;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/game")
public class GameController {
    private GameService service;

    @PostMapping
    public ResponseEntity<Void> save(final @RequestBody GameDto dto) {
        this.service.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Game>> getScores() {
        return ResponseEntity.ok(this.service.getAll());
    }

    @DeleteMapping("/{gameId}")
    public ResponseEntity<Void> delete(final @PathVariable String gameId) {
        this.service.delete(gameId);
        return ResponseEntity.ok().build();
    }
}
