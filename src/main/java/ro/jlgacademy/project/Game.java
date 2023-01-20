package ro.jlgacademy.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document
public class Game {
    @Id
    private String id;
    private String choice;
    private String computerChoice;
    private int computerScore;
    private int userScore;
    private Result result;
}
