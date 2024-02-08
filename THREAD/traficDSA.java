public class traficDSA {


    public static TrafficLightState updateTrafficLightState(TrafficLightState currentState) {
        switch (currentState) {
            case RED:
                return TrafficLightState.GREEN;
            case GREEN:
                return TrafficLightState.YELLOW;
            case YELLOW:
                return TrafficLightState.RED;
            default:
                return currentState;
        }
    }

    public static void main(String[] args) {
        TrafficLightState trafficLight = TrafficLightState.RED;


        for (int i = 0; i < 10; i++) {
            System.out.print("Current Traffic Light State: ");
            switch (trafficLight) {
                case RED:
                    System.out.println("RED");
                    break;
                case GREEN:
                    System.out.println("GREEN");
                    break;
                case YELLOW:
                    System.out.println("YELLOW");
                    break;
            }

            trafficLight = updateTrafficLightState(trafficLight);
        }
    }
}
enum TrafficLightState {
    RED, GREEN, YELLOW
}
