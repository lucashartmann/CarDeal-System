public class CarroUsados extends Carro {

    private double kmCorridos;

    public CarroUsados(String placa, String marca, double kmCorridos) {
        super(placa, marca);
        this.kmCorridos = kmCorridos;
    }

    public double getKmCorridos() {
        return kmCorridos;
    }

    public void setKmCorridos(double kmCorridos) {
        this.kmCorridos = kmCorridos;
    }

    @Override
    public String toString() {
        return "CarroUsados [kmCorridos=" + kmCorridos + "]";
    }

    

}
