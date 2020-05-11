package programmers.level2.day08;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossBridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        TruckCrossBridge truckCrossBridge = new TruckCrossBridge();

        System.out.println(truckCrossBridge.truck(bridge_length, weight, truck_weights));
    }
    //다른사람풀이
    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }

    public int truck(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for(int t : truck_weights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int curWeight = 0;

        while(!waitQ.isEmpty() || !moveQ.isEmpty()) {
            answer++;

            if(moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for(Truck t : moveQ) {
                t.moving();
            }

            if(moveQ.peek().move > bridge_length) {
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }

            if(!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }
        return answer;
    }
//    class Truck {
//        int weight;
//        int entry;
//
//        public Truck(int weight, int entry) {
//            this.weight = weight;
//            this.entry = entry;
//        }
//    }
//    public int truck(int bridge_length, int weight, int[] truck_weights) {
//        Queue<Truck> waiting = new LinkedList<>();
//        Queue<Truck> bridge = new LinkedList<>();
//        int time = 0;
//        int totalWeight = 0;
//
//        for(int i=0; i<truck_weights.length; i++) {
//            waiting.offer(new Truck(truck_weights[i],0));
//        }
//
//        while (!waiting.isEmpty() || !bridge.isEmpty()) {
//            time++;
//            if(!bridge.isEmpty()) {
//                Truck t = bridge.peek();
//                if(time - t.entry >= bridge_length) {
//                    totalWeight -= t.weight;
//                    bridge.poll();
//                }
//            }
//
//            if(!waiting.isEmpty()) {
//                if(totalWeight + waiting.peek().weight <= weight) {
//                    Truck t = waiting.poll();
//                    totalWeight += t.weight;
//
//                    bridge.offer(new Truck(t.weight, time));
//                }
//            }
//        }
//        return time;
//    }
}
