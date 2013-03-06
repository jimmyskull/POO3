/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package brainfuck;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CompilerFaçade {
    public CompilerFaçade() {
        
    }
    
    public void compile(InputStream stream, OutputStream out) {
        ProgramNode program = Parser.parse(stream);
        
        ICodeGenerator backend = new CBackend();
        backend.setOutputStream(out);
        backend.generate(program);
    }
    
    public void compile(String program, OutputStream out) {
        InputStream is = new ByteArrayInputStream(program.getBytes());
        
        compile(is, out);
    }
}
