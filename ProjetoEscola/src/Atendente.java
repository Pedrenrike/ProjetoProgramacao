public class Atendente extends Usuario{
    private double nota;
    private double salario;
    private int avaliadores;
    private int id;
    
    public Atendente() {
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(int avaliadores) {
        this.avaliadores = avaliadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}