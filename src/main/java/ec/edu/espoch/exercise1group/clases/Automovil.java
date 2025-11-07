
package ec.edu.espoch.exercise1group.clases;

import ec.edu.espoch.exercise1group.enumeraciones.Colores;
import ec.edu.espoch.exercise1group.enumeraciones.TipoAutomovil;
import ec.edu.espoch.exercise1group.enumeraciones.TipoCombustible;


public class Automovil {
    //atributos
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoautomovil;
    private Colores colorin;
    private int numpuertas;
    private int cantidadasientos;
    private double veloMax;
    private double veloActual;
    
    
//constructor toda esta parte
    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoautomovil, Colores colorin, int numpuertas, int cantidadasientos, double veloMax, double veloActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoautomovil = tipoautomovil;
        this.colorin = colorin;
        this.numpuertas = numpuertas;
        this.cantidadasientos = cantidadasientos;
        this.veloMax = veloMax;
        this.veloActual = veloActual;
    }

//metodos set and get
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(TipoAutomovil tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    public Colores getColorin() {
        return colorin;
    }

    public void setColorin(Colores colorin) {
        this.colorin = colorin;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getCantidadasientos() {
        return cantidadasientos;
    }

    public void setCantidadasientos(int cantidadasientos) {
        this.cantidadasientos = cantidadasientos;
    }

    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public double getVeloActual() {
        return veloActual;
    }

    public void setVeloActual(int veloActual) {
        this.veloActual = veloActual;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", tipoCombustible=" + tipoCombustible + ", tipoautomovil=" + tipoautomovil + ", colorin=" + colorin + ", numpuertas=" + numpuertas + ", cantidadasientos=" + cantidadasientos + ", veloMax=" + veloMax + ", veloActual=" + veloActual + '}';
    }
    
    
//metodos
       
    public double acelerarvehi(double vAcelerar ){
        double aux = 0;//para verificar el valor de la variable 
        aux=this.veloActual+vAcelerar;
        if(aux<=this.veloMax){
            this.veloActual=aux;
        }
        return this.veloActual;
    }
    public double desacelerarvehi(double vDes ){
        double aux = 0;
        aux=this.veloActual-vDes;
        if(aux<=this.veloActual){
            this.veloActual=aux;
        }
            
        return this.veloActual;
    }
    public double frenar(){
        this.veloActual=0;
     
        return this.veloActual;
    }
    public double caltime(double tiempoRecorrer){
        double tiempollegada=0;
        tiempollegada=tiempoRecorrer/this.veloActual;
        return tiempollegada;
    }
        
}
