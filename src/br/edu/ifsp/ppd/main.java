package br.edu.ifsp.ppd;

public class main {

    public static void main(String ... args) {
        
        Enfeite_parabrisa aguia = new Enfeite_parabrisa();
        aguia.setFormato("Aguia");
        Enfeite_parabrisa pinheiro = new Enfeite_parabrisa();
        pinheiro.setFormato("Pinheiro");


        Motor motor_argo = new Motor();
        motor_argo.setRPM(4000);
        motor_argo.setQtd_Cavalos(77);
        motor_argo.setQtd_Valvulas(6);

        Motor motor1313 = new Motor();
        motor1313.setRPM(2800);
        motor1313.setQtd_Cavalos(130);
        motor1313.setQtd_Valvulas(6);
        

        Caminhao caminhao1313 = new Caminhao();
        caminhao1313.setPlaca("HZW-1880");
        caminhao1313.setDirecao(true);
        caminhao1313.setVelocidade_Max(120.5f);
        caminhao1313.setEnfeite(aguia);
        caminhao1313.setMotor(motor1313);

        Carro Fiat_argo = new Carro();
        Fiat_argo.setPlaca("BNC-4189");
        Fiat_argo.setDirecao(true);
        Fiat_argo.setVelocidade_Max(174.0f);
        Fiat_argo.setEnfeite(pinheiro);
        Fiat_argo.setMotor(motor_argo);

        System.out.println("Caminhao:\n");
        System.out.println("Placa: "+caminhao1313.getPlaca());
        System.out.println("Tem direcao: "+caminhao1313.getDirecao());
        System.out.println("Velocidade maxima: "+caminhao1313.getVelocidade_Max());
        System.out.println("Enfeite: "+caminhao1313.getEnfeite());
        System.out.println("Motor: "+caminhao1313.getMotor());

        System.out.println("Carro:\n");
        System.out.println("Placa: "+Fiat_argo.getPlaca());
        System.out.println("Tem direcao: "+Fiat_argo.getDirecao());
        System.out.println("Velocidade maxima: "+Fiat_argo.getVelocidade_Max());
        System.out.println("Enfeite: "+Fiat_argo.getEnfeite());
        System.out.println("Motor: "+Fiat_argo.getMotor());
    }
}