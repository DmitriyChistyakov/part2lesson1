package participant;

public class Human implements Runnable, Jumpable, Participant {
    private final int maxRunDistance;
    private final int maxJumpDistance;

    public Human(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Человек прыгает:");
        return maxJumpDistance >= distance;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Человек бежит дистанцию: ");
        return maxRunDistance >= distance;
    }
}
