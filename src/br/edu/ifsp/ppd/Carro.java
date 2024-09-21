package br.edu.ifsp.ppd;

public class Carro {
 
    private String placa;
    private Boolean direcao;
    private Float Velocidade_maxima;
    private Enfeite_parabrisa enfeite_parabrisa;
    private Motor motor;

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String aPlaca){
        this.placa = aPlaca;
    }

    public Boolean getDirecao(){
        return this.direcao;
    }
    public void setDirecao(Boolean aDirecao){
        this.direcao = aDirecao;
    }

    public Float getVelocidade_Max(){
        return this.Velocidade_maxima;
    }
    public void setVelocidade_Max(Float aVelocidade_maxima){
        this.Velocidade_maxima = aVelocidade_maxima;
    }

    
    public Enfeite_parabrisa getEnfeite(){
        return this.enfeite_parabrisa;
    }
    public void setEnfeite(Enfeite_parabrisa enfeite_parabrisa){
        this.enfeite_parabrisa = enfeite_parabrisa;
    }   

    public Motor getMotor(){
        return this.motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }    
}