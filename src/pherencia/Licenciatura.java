package pherencia;
public class Licenciatura extends Estudiante{
    private String año;
    public Licenciatura(int id,String nombre,double gpa, String año){
        super(id,nombre, gpa);
	this.año =año;
    }
    public String getAño(){
        return año;
    }
    public void setAño(String año){
        this.año=año;
    }
    @Override
    public String toString() {
	return "Licenciatura"+super.toString()+"\nAño:"+año;
    }
}
