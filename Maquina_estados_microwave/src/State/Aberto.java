package State;

public class Aberto extends MicroEstado 
{
	public String getStatus()
	{
		return "Aberto" ;
	}
	
	public MicroEstado pause()
	{
		return new Pausado() ;
	}
	
	public MicroEstado close()
	{
		return new Fechado() ;
	}
	
	public MicroEstado open()
	{
		return this;
	}
	
	public MicroEstado setPort( boolean porta )
	{
		return this;
	}
	
	public MicroEstado start()
	{
		return this;
	}
	
	public MicroEstado timeOver()
	{
		return this;
	}
}
