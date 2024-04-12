package fr.exo3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static Result calculate(List<Integer> numbers, OperatorType operation) {
        int result = numbers.getFirst();
        List<String> steps = new ArrayList<>();
        steps.add(String.valueOf(result));

        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            result = operation.calculate(result, num);
            steps.add(operation.getSymbol() + num + " (=" + result + ")");
        }

        return new Result(result, steps);
    }
}
