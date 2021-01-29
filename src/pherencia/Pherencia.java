package pherencia;
public class Pherencia {
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(97000, "Sameer", 3.51);
	Estudiante s2 = new Estudiante(98000, 3.22);
	Licenciatura u1 = new Licenciatura(99000, "Shahid", 2.91, "Junior");
	Graduado g1 = new Graduado(200000, "Mubin", 3.57,"Algorithms and Complexity");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(u1);
	System.out.println(g1);

    }
    
}
