package State;

public class ParadoPortaAberta extends EstadosMicroondas
{
  public String getStatus()
  {
    return "Aberto";
  }

  public EstadosMicroondas pause()
  {
    return new EmEspera();
  }

  public EstadosMicroondas close()
  {
    return new ParadoPortaFechada();
  }

  public EstadosMicroondas open()
  {
    return this;
  }

  public EstadosMicroondas setPort(boolean porta)
  {
    return this;
  }

  public EstadosMicroondas start()
  {
    return this;
  }

  public EstadosMicroondas timeOver()
  {
    return this;
  }
}