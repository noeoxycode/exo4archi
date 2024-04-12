public class OutputPrinter {
    public static void printSteps(Result result, char operation) {
        for (String step : result.getSteps()) {
            System.out.println(step);
        }
        System.out.println("-------");
        System.out.printf("total = %d (%s)%n", result.getTotal(), (operation == '+' ? "addition" : "multiplication"));
    }
}
