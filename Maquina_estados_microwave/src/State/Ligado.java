package State;

public class Ligado extends MicroEstado{

	public String getStatus()
	{
		return "Ligado" ;
	}
	public MicroEstado open()
	{
		return new Aberto() ;
	}
	
	public MicroEstado pause()
	{
		return new Fechado() ;
	}
	
	public MicroEstado setPort( boolean porta )
	{
		return this ;
	}
	
	public MicroEstado start()
	{
		return this;
	}
	
	public MicroEstado close()
	{
		return this;
	}
	
	public MicroEstado timeOver() 
	{
		return new Pausado();
	}

}
