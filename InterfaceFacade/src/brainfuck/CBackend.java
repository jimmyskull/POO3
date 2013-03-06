/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfuck;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CBackend implements ICodeGenerator {

    private OutputStream out;

    @Override
    public void setOutputStream(OutputStream stream) {
        out = stream;
    }

    private void output(String data) {
        try {
            out.write(data.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(CBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void emitHeader() {
        output("#include <stdio.h>\n");
        output("#define A ++ptr\n");
        output("#define B --ptr\n");
        output("#define C ++*ptr\n");
        output("#define D --*ptr\n");
        output("#define O putchar(*ptr)\n");
        output("#define R *ptr=getchar()\n");
        output("#define L while (*ptr) {\n");
        output("int main(){ char array[30000];char *ptr=array;");
    }
    
    private void emitFooter() {
        output("return 0;}\n");
    }

    private void emitToken(Token token) {
        switch (token) {
            case PTR_INCREMENT:
                output("A;");
            case PTR_DECREMENT:
                output("B;");
            case VALUE_INCREMENT:
                output("C;");
            case VALUE_DECREMENT:
                output("D;");
            case PRINT:
                output("O;");
            case READ:
                output("R;");
            case START_LOOP:
                output("L");
            case END_LOOP:
                output("}");
        }
    }

    @Override
    public void generate(ProgramNode program) {
        emitHeader();
        while (program != null) {
            emitToken(program.getToken());
            program = program.getNext();
        }
        emitFooter();
    }
}
