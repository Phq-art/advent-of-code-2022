package main.java.year2022.days;

import main.Day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day2 extends Day {

    public static final String ROCK_OPPONENT = "A";
    public static final String PAPER_OPPONENT = "B";
    public static final String ROCK_ME = "X";
    public static final String PAPER_ME = "Y";
    public static final int ROCK_PTS = 1;
    public static final int PAPER_PTS = 2;
    public static final int SCISSORS_PTS = 3;
    public static final int LOSS = 0;
    public static final int DRAW = 3;
    public static final int WIN = 6;

    public Day2() {
        super(2022, 2);
    }

    public int getRockPaperScissorsMatchScore() throws IOException {
        File calories = getResource("rock_paper_scissors.txt");
        int matchScore = 0;

        BufferedReader br = new BufferedReader(new FileReader(calories));
        String round;

        while (br.ready()) {
            round = br.readLine().trim();
            String[] moves = round.split(" ");
            String opponent = moves[0];
            String me = moves[1];
            matchScore += calcRoundScore(opponent, me);
        }
        return matchScore;
    }

    private int calcRoundScore(final String opponentChoice, final String myChoice) {
        if (opponentChoice.equals(ROCK_OPPONENT)) {
            if (myChoice.equals(ROCK_ME)) {
                return DRAW + ROCK_PTS;
            } else if (myChoice.equals(PAPER_ME)) {
                return WIN + PAPER_PTS;
            } else {
                return LOSS + SCISSORS_PTS;
            }
        } else if (opponentChoice.equals(PAPER_OPPONENT)) {
            if (myChoice.equals(ROCK_ME)) {
                return LOSS + ROCK_PTS;
            } else if (myChoice.equals(PAPER_ME)) {
                return DRAW + PAPER_PTS;
            } else {
                return WIN + SCISSORS_PTS;
            }
        } else {
            if (myChoice.equals(ROCK_ME)) {
                return WIN + ROCK_PTS;
            } else if (myChoice.equals(PAPER_ME)) {
                return LOSS + PAPER_PTS;
            } else {
                return DRAW + SCISSORS_PTS;
            }
        }
    }
}
