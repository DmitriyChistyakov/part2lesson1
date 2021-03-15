package participant;


public class Cat implements Runnable, /**Jumpable,*/ Participant {
//    private final int maxJumpDistance; //не используется
    private final int maxRunDistance;



    public Cat(int maxRunDistance, int maxJumpDistance) {  /** не понятна проблема*/
//        this.maxJumpDistance = maxJumpDistance; // не используется
        this.maxRunDistance = maxRunDistance;
    }

//    @Override
//    public boolean jump(int distance) {
//        System.out.println("Кот прыгает:  ");
//        return maxJumpDistance >= distance;
//    }

    @Override
    public boolean run(int distance) {
        System.out.println("Кот бежит:  ");
        return maxRunDistance >= distance;
    }
}
