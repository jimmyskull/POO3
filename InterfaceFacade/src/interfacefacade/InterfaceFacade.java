/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefacade;

import brainfuck.CompilerFaçade;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InterfaceFacade {

    /* Exemplo de como usar o façade */
    public static void main(String[] args) {
        CompilerFaçade compiler = new CompilerFaçade();
        
        compiler.compile("++++[>+<-].", System.out);
    }
}
