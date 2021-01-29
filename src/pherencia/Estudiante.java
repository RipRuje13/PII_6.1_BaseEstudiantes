package pherencia;
public class Estudiante {
    private String nombre;
    private int id;
    private double gpa;
    public Estudiante(int id, String nombre, double gpa) {
		this.id = id;
		this.nombre=nombre;
		this.gpa = gpa;
	}
	public Estudiante(int id, double gpa){
		this(id, "", gpa);
	}
	
	public String getName(){
		return nombre;
	}
	public int getId() {
		return id;
	}
	public double getGPA(){
		return gpa;
	}
	
	public void setName(String newNombre){
		this.nombre= newNombre;
	}
    @Override
	public String toString(){
		return "Estudiante:\nID: "+id+"\nNombre: "+nombre+"\nGPA: "+gpa;
	}

}
