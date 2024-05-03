import java.util.Date;

public class Usuario {
    private int id;
    private boolean consentimento;
    private Date dataNascimento;
    private String nome;
    private String cpf;
    private String role;
    private String senha;
    private String telefone;
    private String estado;
    private String municipio;
    private String cep;
    private String bairro;
    private String logradouro;
    private int numero;
    private String complemento;

    public Usuario(int id, boolean consentimento, Date dataNascimento, String nome, String cpf, String role, String senha, String telefone, String estado, String municipio, String cep, String bairro, String logradouro, int numero, String complemento) {
        this.id = id;
        this.consentimento = consentimento;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
        this.role = role;
        this.senha = senha;
        this.telefone = telefone;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConsentimento() {
        return consentimento;
    }

    public void setConsentimento(boolean consentimento) {
        this.consentimento = consentimento;
    }

}
