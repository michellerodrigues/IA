package State;

public class Aquecendo extends EstadosMicroondas
{
  public String getStatus()
  {
    return "Aquecendo";
  }

  public EstadosMicroondas open() {
    return new ParadoPortaAberta();
  }

  public EstadosMicroondas pause()
  {
    return new ParadoPortaFechada();
  }

  public EstadosMicroondas setPort(boolean porta)
  {
    return this;
  }

  public EstadosMicroondas start()
  {
    return this;
  }

  public EstadosMicroondas close()
  {
    return this;
  }

  public EstadosMicroondas timeOver()
  {
    return new EmEspera();
  }
}