package states;

public class Completed implements State{
	
    /**
     * getState()
     * @return "Completed" the state of the racer 
     */
    @Override
    public String getState() {
        return "Completed";
    }
}
