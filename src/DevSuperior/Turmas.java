package DevSuperior;

public class Turmas {

    public Turmas(){}
    private String sala;
    private String nomeDaTurma;
    private String turno;

    public String getSala(){
        return  sala;
    }
    public void setSala(String sala){
        this.sala = sala;
    }

    public String getNomeDaTurma(){
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma){
        this.nomeDaTurma = nomeDaTurma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
