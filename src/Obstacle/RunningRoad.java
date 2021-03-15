package Obstacle;

import participant.*;
import participant.Runnable;


public class RunningRoad implements Obstacle {
    private final int length;

    public RunningRoad(int length) {
        this.length = length;
    }

    @Override
    public boolean doItNow(Participant participant) {
        if (participant instanceof Runnable){
            return ((Runnable) participant).run(length);
        }
        System.out.println("Участник не умеет бегать....");
        return false;
    }
}
