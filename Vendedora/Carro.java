public class Carro {

    private String placa;
    private String marca;

    public Carro(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void getInfo() {
        System.out.print("[Marca: " + getMarca() + ", Placa: " + getPlaca() + "] \n");
    }

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", marca=" + marca + "]";
    }

    

}
