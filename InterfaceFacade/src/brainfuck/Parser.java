
package brainfuck;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parser {
    public static ProgramNode parse(InputStream stream) {
        ProgramNode first = null;
        ProgramNode node = null;
        try {
            
            while (stream.available() > 0) {
                char b = (char) stream.read();
                ProgramNode new_node = new ProgramNode(Token.fromChar(b));
                if (first == null)
                    first = new_node;
                else
                    node.setNext(new_node);
                node = new_node;            
            }
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return first;
    }
}
