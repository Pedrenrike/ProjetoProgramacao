public class Produto {
    private int id;
    private String nome;
    private String descrição;
    private int quant;
    private double comissão;
    private double valor;
    
    public Produto(int id, String nome, String descrição, int quant, double comissão, double valor) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.quant = quant;
        this.comissão = comissão;
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
