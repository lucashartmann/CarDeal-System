public class CarrosUsados extends Carros {

    private double kmCorridos;


    public CarrosUsados(String placa, String marca, double kmCorridos) {
        super(placa, marca);
        this.kmCorridos = kmCorridos;
    }


    public double getKmCorridos() {
        return kmCorridos;
    }


    public void setKmCorridos(double kmCorridos) {
        this.kmCorridos = kmCorridos;
    }

    
    
}
