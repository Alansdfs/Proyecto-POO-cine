import java.util.ArrayList;
public class Pelicula{
	private String titulo, sinopsis, clasificacion, genero;
	private int duracion;
	private ArrayList<Proyeccion> proyecciones;

	public Pelicula(){
		this((int)0);
	}

	public Pelicula(int duracion){
		this.duracion=duracion;
		titulo= new String();
		sinopsis=new String();
		clasificacion=new String();
		genero=new String();
		proyecciones=new ArrayList<Proyeccion>();

	}

	@Override
	public String toString(){
		String aux, aux2;
		aux= new String("\n\t");
		aux2=new String();

		for(Proyeccion proyeccion: proyecciones) {
		    aux+=" "+proyeccion;
		}

		aux2= titulo + "\n\t ("+duracion+" min), "+"clasificacion: "+
				clasificacion+", "+genero+"\n\n\t"+
				sinopsis;	

		return aux2+aux;
	}
}