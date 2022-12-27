public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double comissao;
    private double valor;
    
    public Produto(String nome, String descrição, int quant, double comissão, double valor) {
        this.nome = nome;
        this.descricao = descrição;
        this.quantidade = quant;
        this.comissao = comissão;
        this.valor = valor;
    }

    public Produto() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
