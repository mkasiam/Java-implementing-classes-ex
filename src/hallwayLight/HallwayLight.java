package hallwayLight;

public class HallwayLight {

    private int firstLampState, secondLampState, lampState;

    public HallwayLight() {
        firstLampState = 0;
        secondLampState = 0;
        lampState = 0;
    }


    public int getFirstLampState() {
        return firstLampState;
    }

    public int getSecondLampState(){
        return secondLampState;
    }

    public int getLampState() {
        return lampState;
    }

    public void toggleFirstSwitch(){
        firstLampState = 1 - firstLampState;
        updateLampCurrentState();
    }

    public void toggleSecondSwitch(){
        secondLampState = 1 - secondLampState;
        updateLampCurrentState();
    }

    public void updateLampCurrentState(){
       lampState = firstLampState ^ secondLampState;
    }
}
