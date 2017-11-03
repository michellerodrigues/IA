package Principal;

import handlers.HButtons;
import handlers.HPort;
import Controller.Microondas;
import GUI.Frame;

public class Main
{
  public static void main(String[] args)
  {
    Microondas micro = new Microondas();
    HButtons hButton = new HButtons(micro);
    HPort hPort = new HPort(micro);
    Frame f = new Frame(hButton, hPort);
    micro.addObserver(f);
  }
}