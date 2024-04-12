package fr.exo3;

import java.util.List;

public class Result {
    private final int total;
    private final List<String> steps;

    public Result(int total, List<String> steps) {
        this.total = total;
        this.steps = steps;
    }

    public int getTotal() {
        return total;
    }

    public List<String> getSteps() {
        return steps;
    }
}
