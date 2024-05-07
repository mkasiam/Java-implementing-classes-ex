package hallwayLight;

public class HallwaySwitchControl {

    private int firstSwitchState, secondSwitchState, lampState;

    public HallwaySwitchControl() {
        firstSwitchState = 0;
        secondSwitchState = 0;
    }

    public int getFirstSwitchState() {
        return firstSwitchState;
    }

    public int getSecondSwitchState() {
        return secondSwitchState;
    }


    public int getLampState() {
        return lampState;
    }

    public void toggleSwitch(int switchNum) {
        if (switchNum == 1){
            firstSwitchState = firstSwitchState ^ 1;
        } else if (switchNum == 2) {
            secondSwitchState = secondSwitchState ^ 1;
        }
        updateLampState();
    }

    public void updateLampState() {
        lampState = firstSwitchState ^ secondSwitchState;
    }

}
