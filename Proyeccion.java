public class Proyeccion{
	private Horaio horario;
	private Sala sala;
	private float costo;
	private String idioma;

	public Proyeccion(){
		this(0f);
	}

	public Proyeccion(float costo){
		this.costo=costo;
		horario= new Horario();
		sala= new Sala();
		idioma= new String();
	}

	@Override 
	public String toString(){
		return "\n"+horario + "\n\t"+sala + " "+ idioma +" $"+ costo;
	}
}
