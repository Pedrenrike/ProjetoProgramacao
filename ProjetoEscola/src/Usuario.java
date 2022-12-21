public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String cpf;
    private int idade;
    private String telefone;
    private String cidade;

    public Usuario(int id, String login, String senha, String cpf, int idade, String telefone, String cidade) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public Usuario() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
