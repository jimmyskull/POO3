/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfuck;

import java.io.OutputStream;

public interface ICodeGenerator {
    public void setOutputStream(OutputStream stream);

    public void generate(ProgramNode program);
}
