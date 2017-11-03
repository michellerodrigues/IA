package State;


public abstract class EstadosMicroondas
{
  public static EstadosMicroondas getEstadoInicial()
  {
    return new EmEspera();
  }

  public abstract String getStatus();

  public abstract EstadosMicroondas pause();

  public abstract EstadosMicroondas open();

  public abstract EstadosMicroondas close();

  public abstract EstadosMicroondas setPort(boolean paramBoolean);

  public abstract EstadosMicroondas start();

  public abstract EstadosMicroondas timeOver();
}