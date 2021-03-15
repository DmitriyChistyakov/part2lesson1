package Obstacle;

import participant.Jumpable;
import participant.Participant;

public class Wall implements Obstacle {
    private final int height;


    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doItNow(Participant participant) {
        if(participant instanceof Jumpable){
            return ((Jumpable) participant).jump(height);

        }
        System.out.println("Участник не умеет прыгать....");
        return false;
    }
}
