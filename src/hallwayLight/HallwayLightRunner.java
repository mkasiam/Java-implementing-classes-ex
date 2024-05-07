package hallwayLight;

public class HallwayLightRunner {
    public static void main(String[] args) {

        HallwayLight situation = new HallwayLight();
        System.out.println("Initial State:");

        System.out.println("First Lamp State: " + situation.getFirstLampState());
        System.out.println("Second Lamp State: " + situation.getSecondLampState());
        System.out.println("Light State: " + situation.getLampState());

        System.out.println("-------------");
        situation.toggleFirstSwitch();// toggle First switch

        System.out.println("After Toggling First Switch");
        System.out.println("First Lamp State: " + situation.getFirstLampState());
        System.out.println("Second Lamp State: " + situation.getSecondLampState());
        System.out.println("Light State: " + situation.getLampState());

        situation.toggleSecondSwitch();// toggle second switch
        System.out.println("-------------");
        System.out.println("After Toggling Second Switch");
        System.out.println("First Lamp State: " + situation.getFirstLampState());
        System.out.println("Second Lamp State: " + situation.getSecondLampState());
        System.out.println("Light State: " + situation.getLampState());





    }
}
