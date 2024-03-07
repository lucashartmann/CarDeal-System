public class Carros {

    private String placa;
    private String marca;

    public Carros(String placa, String marca) {
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

}
