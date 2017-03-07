package domain.instrument;

import org.springframework.stereotype.Service;

@Service("instrument")
public class Saxophone implements Instrument {
  public Saxophone() {}

  @Override
  public void play() {
    System.out.println("TOOT TOOT TOOT");
  }
}