public class real {


    enum TrafficLightState {
        RED, GREEN, YELLOW, PEDESTRIAN_RED, PEDESTRIAN_GREEN
    }

    public static void main(String[] args) {
        TrafficLightState currentState = TrafficLightState.RED;

        while (true) {
            switch (currentState) {
                case RED:
                    currentState = TrafficLightState.GREEN;
                    System.out.println("Traffic Light: RED");
                    break;
                case GREEN:
                    currentState = TrafficLightState.YELLOW;
                    System.out.println("Traffic Light: GREEN");
                    break;
                case YELLOW:
                    currentState = TrafficLightState.RED;
                    System.out.println("Traffic Light: YELLOW");
                    break;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
