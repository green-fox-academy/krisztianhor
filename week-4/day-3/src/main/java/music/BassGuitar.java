package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
