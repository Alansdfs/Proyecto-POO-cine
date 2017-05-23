import java.util.date;
public class ClienteFrecuente{
	private int porcentaje;
	private Date fecha;
	
	public ClienteFrecuente(){
		porcentaje=0;
		fecha= new Date();
	}
	
	public int consultarPromociones(){
		return porcentaje;	
	}
	
}
