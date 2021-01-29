package pherencia;
public class Graduado extends Estudiante{
    private String titulotesis;
    public Graduado(int id,String nombre,double gpa, String titulotesis){
        super(id,nombre, gpa);
	this.titulotesis =titulotesis;
    }
    public String getTitulotesis(){
        return titulotesis;
    }
    public void setTitulotesis(String titulotesis){
        this.titulotesis=titulotesis;
    }
    @Override
    public String toString(){
        return "Graduado"+super.toString()+"\nTesis: "+titulotesis;
    }
}
