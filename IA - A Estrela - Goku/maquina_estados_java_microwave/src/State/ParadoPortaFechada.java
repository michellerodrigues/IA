package State;

public class ParadoPortaFechada extends EstadosMicroondas
{
  public String getStatus()
  {
    return "Fechado";
  }

  public EstadosMicroondas open() {
    return new ParadoPortaAberta();
  }

  public EstadosMicroondas setPort(boolean porta)
  {
    return this;
  }

  public EstadosMicroondas start()
  {
    return new Aquecendo();
  }

  public EstadosMicroondas pause()
  {
    return new EmEspera();
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