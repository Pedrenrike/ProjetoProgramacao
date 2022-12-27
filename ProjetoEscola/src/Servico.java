public class Servico {
    private int id;
    private String nome;
    private String descrição;
    private double valor;
    
    public Servico(int id, String nome, String descrição, double valor) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
    }

    public Servico() {
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
