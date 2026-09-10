package DevSuperior;

public class OperacoesAvancadas {
    public double ladoa;
    public double ladob;
    public double ladoc;
    public double area ;



    public OperacoesAvancadas(double ladoa, double ladob, double ladoc){
    this.ladoc = ladoc;
    this.ladoa = ladoa;
    this.ladob = ladob;

    }

    public OperacoesAvancadas() {

    }

    public void calcularArea() {


        try {
            if(ladoa <=0 || ladob <=0 || ladoc<=0){
                throw new IllegalArgumentException("Valores com zero");
            }
            double p = 0;
            p = (ladoa + ladob + ladoc) / 2;
            double calculoArea = Math.sqrt(p * (p - ladoa) * (p - ladob) * (p - ladoc));
            area = calculoArea;
            System.out.println(area);

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



        }


}


