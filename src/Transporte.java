import java.util.ArrayList;

public class Transporte {

    private ArrayList<Transporte> transportables;
    private double capacidadMaxima;
    private double capacida;
    private Dimension dimension;
    private int cantidadMaxima;

   public Transporte(double capacidadMaxima,Dimension dimension, int cantidadMaxima){
        setTransportables(new ArrayList<Transporte>());
        setCapacida(0);
        setCantidadMaxima(cantidadMaxima);
        setDimension(dimension);
        setCapacidadMaxima(capacidadMaxima);
    }



    public ArrayList<Transporte> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<Transporte> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacida() {
        return capacida;
    }

    public void setCapacida(double capacida) {
        this.capacida = capacida;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }



}
