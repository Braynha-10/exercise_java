package br.edu.ifsp.ppd;

public class Motor {

    private int RPM;
    private int Qtd_Cavalos;
    private int Qtd_Valvulas;
    // private

    public int getRPM() {
        return this.RPM;
    }
    public void setRPM(int oRPM) {
        this.RPM = oRPM;
    }

    public int getQtd_Cavalos() {
        return this.Qtd_Cavalos;
    }
    public void setQtd_Cavalos(int cavalos) {
        this.Qtd_Cavalos = cavalos;
    }

    public int getQtd_Valvulas() {
        return this.Qtd_Valvulas;
    }
    public void setQtd_Valvulas(int valvulas) {
        this.Qtd_Valvulas = valvulas;
    }

}
