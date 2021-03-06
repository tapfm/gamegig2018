package net.tundra.gamegig2018;

import net.tundra.core.Game;
import net.tundra.core.TundraException;

public class Main extends Game {
  public Main() {
    super(1920, 1080, "gamegig2018", true);
  }

  @Override
  public void initStates() throws TundraException {
    getInput().setMouseGrabbed(true);
    addState(new Tundra());
    addState(new Menu());
    addState(new GameWorld());
    enterState(0);
  }

  public static void main(String args[]) throws TundraException {
    Game game = new Main();
    game.start();
  }
}
