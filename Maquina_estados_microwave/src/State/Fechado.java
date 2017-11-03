package State;

public class Fechado extends MicroEstado
{	
	public String getStatus()
	{
		return "Fechado" ;
	}
	public MicroEstado open()
	{
		return new Aberto() ;
	}
	
	public MicroEstado setPort( boolean porta )
	{
		return this ;
	}
	
	public MicroEstado start()
	{
		return new Ligado();
	}
	
	public MicroEstado pause()
	{
		return new Pausado() ;
	}
	
	public MicroEstado close()
	{
		return this ;
	}
	
	public MicroEstado timeOver()
	{
		return this;
	}
}
