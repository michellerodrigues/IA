package State;

public abstract class MicroEstado {
	
	public static MicroEstado getEstadoInicial()
	{
		return new Pausado() ;
	}
	
	public abstract String getStatus();
	
	public abstract MicroEstado pause() ;
	public abstract MicroEstado open() ;
	public abstract MicroEstado close() ;
	public abstract MicroEstado setPort( boolean porta ) ;
	public abstract MicroEstado start() ;
	public abstract MicroEstado timeOver();
}
