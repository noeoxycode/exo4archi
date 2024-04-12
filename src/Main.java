import java.util.List;


//les arguments: exemple à copier coller:
// numbers.csv '*'
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Pas d'arguments fournis. Veuillez renseigner un nom de fichier et une opération (+ ou *).");
            return;
        }

        String fileName = args[0];
        char operation = args[1].charAt(1);

        String filePath = System.getProperty("user.dir") + "/" + fileName;
        List<Integer> numbers = InputReader.readCSV(filePath);
        if (numbers.isEmpty()) {
            System.out.println("Pas de numéro trouvé dans le CSV.");
            return;
        }

        OperatorType operator = OperatorType.getFromSymbol(String.valueOf(operation));
        Result result = Calculator.calculate(numbers, operator);
        OutputPrinter.printSteps(result, operation);
    }
}
