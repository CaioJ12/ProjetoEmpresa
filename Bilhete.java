public class Bilhete {
    private int id;
    public int ano;
    public int mes;
    public int numero_id;
    public int usuario_id;

    public Bilhete(int id, int ano, int mes, int numero_id, int usuario_id) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero_id = numero_id;
        this.usuario_id = usuario_id;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_id() {
        return numero_id;
    }

    public void setNumero_id(int numero_id) {
        this.numero_id = numero_id;
    }
}
