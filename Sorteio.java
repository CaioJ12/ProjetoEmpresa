public class Sorteio {
    private int ID;
    public int ano;
    private int identificador;
    public int mes;
    public double valor_premio;
    public int auditor;
    public int premiado;
    public String descricao;
    public String tipo;

    public Sorteio(int ID, int ano, int identificador, int mes, double valor_premio, int auditor, int premiado, String descricao, String tipo) {
        this.ID = ID;
        this.ano = ano;
        this.identificador = identificador;
        this.mes = mes;
        this.valor_premio = valor_premio;
        this.auditor = auditor;
        this.premiado = premiado;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    // Getters e Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
