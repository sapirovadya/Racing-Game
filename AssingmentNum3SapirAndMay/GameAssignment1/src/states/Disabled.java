package states;

public class Disabled implements State{

    /**
     * getState()
     * @return "Failed" the state of the racer 
     */
    @Override
    public String getState() {
        return "Failed";
    }
}
