package ro.jlgacademy.project;

import lombok.Getter;

@Getter
public class GameDto {
    private String choice;
    private String computerChoice;
    private int computerScore;
    private int userScore;
    private String result;
}
