package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testAprovadoSemAI() {
        Aluno aluno = new Aluno(20, 20, 35);
        assertEquals(1, aluno.aprovacao());
    }

    @Test
    public void testReprovado() {
        Aluno aluno = new Aluno(10, 10, 10);
        assertEquals(3, aluno.aprovacao());
    }
}
