import java.util.NoSuchElementException;

public enum OperatorType {
    ADDITION("+") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    };

    //WOW ! on dirait que les autres opérations ont été anticipées mais comment les activer ?
    //Il suffit de décommenter les lignes de code ci-dessous et de les adapter à la nouvelle structure de l'enum
    /*
    MULTIPLICATION("*") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
        SUBTRACTION("-") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    DIVISION("/") {
        @Override
        public int calculate(int operand1, int operand2) {
            if (operand2 != 0) {
                return operand1 / operand2;
            } else {
                throw new ArithmeticException("Division par zero");
            }
        }
    };

     */

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public abstract int calculate(int operand1, int operand2);

    public static OperatorType getFromSymbol(String symbol) {
        for (OperatorType operator : values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new NoSuchElementException("Aucun opérateur avec le symbole '" + symbol + "' n'a été trouvé.");
    }
}
