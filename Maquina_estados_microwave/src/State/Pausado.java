package State;

public class Pausado extends MicroEstado
{	
	public String getStatus()
	{
		return "Pausado" ;
	}
	
	public MicroEstado setPort( boolean porta )
	{
		if( !porta )
		{
			return new Fechado() ;
		}
		
		return new Aberto() ;
	}
	
	public MicroEstado start()
	{
		return this ;
	}
	
	public MicroEstado pause()
	{
		return this ;
	}
	
	public MicroEstado open()
	{
		return new Aberto() ;
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
