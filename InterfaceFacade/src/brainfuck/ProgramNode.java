package brainfuck;

public class ProgramNode {
    private Token token;
    private ProgramNode next = null;
    
    ProgramNode(Token token) {
        setToken(token);
    }
    
    private void setToken(Token token) {
        this.token = token;
    }
    
    public Token getToken() {
        return token;
    }
    
    public void setNext(ProgramNode node) {
        next = node;
    }
    
    public ProgramNode getNext() {
        return next;
    }
    
    public Boolean hasNext() {
        return getNext() != null;
    }
    
    @Override
    public String toString() {
        return "Node (token = " + Token.toString(getToken()) + ")\n";
    }
}
