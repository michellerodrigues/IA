package State;

public class EmEspera extends EstadosMicroondas
{
  public String getStatus()
  {
    return "EmEspera";
  }

  public EstadosMicroondas setPort(boolean porta)
  {
    if (!porta)
    {
      return new ParadoPortaFechada();
    }

    return new ParadoPortaAberta();
  }

  public EstadosMicroondas start()
  {
    return this;
  }

  public EstadosMicroondas pause()
  {
    return this;
  }

  public EstadosMicroondas open()
  {
    return new ParadoPortaAberta();
  }

  public EstadosMicroondas close()
  {
    return this;
  }

  public EstadosMicroondas timeOver()
  {
    return this;
  }
}