package brainfuck;

public enum Token {

    PTR_INCREMENT,
    PTR_DECREMENT,
    VALUE_INCREMENT,
    VALUE_DECREMENT,
    PRINT,
    READ,
    START_LOOP,
    END_LOOP;

    public static Token fromChar(char t) {
        switch (t) {
            case '>': return PTR_INCREMENT;
            case '<': return PTR_DECREMENT;
            case '+': return VALUE_INCREMENT;
            case '-': return VALUE_DECREMENT;
            case '.': return PRINT;
            case ',': return READ;
            case '[': return START_LOOP;
            case ']': return END_LOOP;
        }
        return null;
    }
        
    public static String toString(Token t) {
        switch (t) {
            case PTR_INCREMENT: return ">";
            case PTR_DECREMENT: return "<";
            case VALUE_INCREMENT: return "+";
            case VALUE_DECREMENT: return "-";
            case PRINT: return ".";
            case READ: return ",";
            case START_LOOP: return "[";
            case END_LOOP: return "]";
        }
        return "<invalid token>";
    }
}
