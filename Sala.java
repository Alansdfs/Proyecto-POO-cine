public class Sala{
	private int numerodesala;
	private String tipodesala;

	public Sala(int numerodesala){
		this.numerodesala=numerodesala;
		tipodesala= new String();
	}

	public Sala(){
		this((int)0);
	}

	@Override
	public String toString(){
		return "sala: "+ numerodesala+ ". Tipo: "+ tipodesala;
	}
}