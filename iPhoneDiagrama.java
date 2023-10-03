public class iPhoneDiagrama {

    private String modelo;
    private String cor;
    private int capacidade;
    private double preco;


    public iPhoneDiagrama(String modelo, String cor, int capacidade, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações sobre o iPhone
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade: " + capacidade + " GB");
        System.out.println("Preço: R$" + preco);
    }

    // Método para ligar o iPhone
    public void ligar() {
        System.out.println("O iPhone está ligado.");
    }

    // Método para desligar o iPhone
    public void desligar() {
        System.out.println("O iPhone está desligado.");
    }

    // Outros métodos relacionados ao iPhone podem ser adicionados aqui

    public static void main(String[] args) {
        // Exemplo de uso da classe iPhone
        iPhoneDiagrama meuIPhone = new iPhoneDiagrama("iPhone 13","Vermelho", 128, 5999.99);
        meuIPhone.exibirInformacoes();
        meuIPhone.ligar();
        meuIPhone.desligar();
    }
}
