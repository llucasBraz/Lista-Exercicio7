package listas.lista01;

public class Aluno {
    private int A1;
    private int A2;
    private int A3;
    private int AI;

    public Aluno(int A1, int A2, int A3) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
    }

    public int pontuacaoFinal() {
        return A1 + A2 + A3;
    }

    public int aprovacao() {
        int total = pontuacaoFinal();
        if (total >= 70) {
            return 1;
        } else if (AI > 0) {
            int menorNota = Math.min(A1, A2);
            if (AI > menorNota) {
                total = AI + Math.max(A1, A2) + A3;
                if (total >= 70) {
                    return 2;
                }
            }
        }
        return 3;
    }

    public void setAI(int AI) {
        this.AI = AI;
    }
}
