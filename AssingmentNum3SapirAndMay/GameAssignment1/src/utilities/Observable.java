package utilities;

import game.arenas.Arena;

//import java.util.Vector;
//
//public class Observable {
//	
//	Vector<Observer>List;
//    private Observer obsArena;
//    private Observer obsPanel;
//
//    public Observable() {
//    }
//
//    public void notifyTheArena() {
//    	obsArena.update(this);
//    }
//    public void notifyThePanel() {
//    	obsPanel.update(this);
//    }
//    public void registerPanel(Observer observer) {
//    	obsPanel = observer;
//    }
//    public void registerArena(Observer observer) {
//    	obsArena = observer;
//    }
//}

public interface Observable {
    /**
     * register(Observer ar)
     * @param ar
     * register every racer to the arena.
     */
    public void register(Observer ar);
    //public void register(Arena ar);

    /**
     * notifyObserver()
     * notify the observer of the racer.
     */
    public void notifyObserver();
}
