package pokemon;

public class Move {
    private String nomeDoMovimento;
    private short danoBase;
    private byte numDeRepeticoes;
    private Tipo tipoPrimario;

    public Move(short danoBase, String nomeDoMovimento, byte numDeRepeticoes, Tipo tipoPrimario) {
        this.danoBase = danoBase;
        this.nomeDoMovimento = nomeDoMovimento;
        this.numDeRepeticoes = numDeRepeticoes;
        this.tipoPrimario = tipoPrimario;
    }



    public String getNomeDoMovimento() {
        return nomeDoMovimento;
    }

    public void setNomeDoMovimento(String nomeDoMovimento) {
        this.nomeDoMovimento = nomeDoMovimento;
    }

    public short getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(short danoBase) {
        this.danoBase = danoBase;
    }

    public byte getNumDeRepeticoes() {
        return numDeRepeticoes;
    }

    public void setNumDeRepeticoes(byte numDeRepeticoes) {
        this.numDeRepeticoes = numDeRepeticoes;
    }

    public Tipo getTipoPrimario() {
        return tipoPrimario;
    }

    public void setTipoPrimario(Tipo tipoPrimario) {
        this.tipoPrimario = tipoPrimario;
    }

    @Override
    public String toString() {
        return this.nomeDoMovimento;
    }
}