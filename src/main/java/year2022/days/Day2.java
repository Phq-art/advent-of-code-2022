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
    public static final String LOSS_OUTCOME = "X";
    public static final String DRAW_OUTCOME = "Y";
    public static final int ROCK_PTS = 1;
    public static final int PAPER_PTS = 2;
    public static final int SCISSORS_PTS = 3;
    public static final int LOSS = 0;
    public static final int DRAW = 3;
    public static final int WIN = 6;

    public Day2() {
        super(2022, 2);
    }

    // Part 1 of the puzzle
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

    public int getRockPaperScissorsMatchScorePartTwo() throws IOException {
        File calories = getResource("rock_paper_scissors.txt");
        int matchScore = 0;

        BufferedReader br = new BufferedReader(new FileReader(calories));
        String round;

        while (br.ready()) {
            round = br.readLine().trim();
            String[] outcome = round.split(" ");
            String opponent = outcome[0];
            String me = outcome[1];
            matchScore += calcRoundScorePartTwo(opponent, me);
        }
        return matchScore;
    }

    private int calcRoundScore(final String opponentChoice, final String outcome) {
        if (opponentChoice.equals(ROCK_OPPONENT)) {
            if (outcome.equals(ROCK_ME)) {
                return LOSS + ROCK_PTS;
            } else if (outcome.equals(PAPER_ME)) {
                return DRAW + PAPER_PTS;
            } else {
                return WIN + SCISSORS_PTS;
            }
        } else if (opponentChoice.equals(PAPER_OPPONENT)) {
            if (outcome.equals(ROCK_ME)) {
                return LOSS + ROCK_PTS;
            } else if (outcome.equals(PAPER_ME)) {
                return DRAW + PAPER_PTS;
            } else {
                return WIN + SCISSORS_PTS;
            }
        } else {
            if (outcome.equals(ROCK_ME)) {
                return LOSS + ROCK_PTS;
            } else if (outcome.equals(PAPER_ME)) {
                return DRAW + PAPER_PTS;
            } else {
                return WIN + SCISSORS_PTS;
            }
        }
    }

    private int calcRoundScorePartTwo(final String opponentChoice, final String outcome) {
        if (opponentChoice.equals(ROCK_OPPONENT)) {
            if (outcome.equals(LOSS_OUTCOME)) {
                return LOSS + SCISSORS_PTS;
            } else if (outcome.equals(DRAW_OUTCOME)) {
                return DRAW + ROCK_PTS;
            } else {
                return WIN + PAPER_PTS;
            }
        } else if (opponentChoice.equals(PAPER_OPPONENT)) {
            if (outcome.equals(LOSS_OUTCOME)) {
                return LOSS + ROCK_PTS;
            } else if (outcome.equals(DRAW_OUTCOME)) {
                return DRAW + PAPER_PTS;
            } else {
                return WIN + SCISSORS_PTS;
            }
        } else {
            if (outcome.equals(LOSS_OUTCOME)) {
                return LOSS + PAPER_PTS;
            } else if (outcome.equals(DRAW_OUTCOME)) {
                return DRAW + SCISSORS_PTS;
            } else {
                return WIN + ROCK_PTS;
            }
        }
    }

}
