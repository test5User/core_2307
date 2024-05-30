package lesson33._01_traning;

import lombok.Getter;

import java.util.StringJoiner;

public class TrainingException extends Exception {
    @Getter
    private String errLine;

    public TrainingException(String errLine, Throwable cause) {
        super(cause);
        this.errLine = errLine;
    }

    @Override
    public String toString() {
        return "Error line: " + errLine;
    }
}
