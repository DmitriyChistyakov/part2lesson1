package participant;

public class Robot implements Runnable, Jumpable, Participant {
    private final int maxRunDistance;
    private final int maxJumpDistance;

    public Robot(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Робот прыгает через стену: ");
        return maxJumpDistance >= distance;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Робот бежит: ");
        return maxRunDistance >= distance;
    }
}
