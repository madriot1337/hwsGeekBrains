public class Robot implements Players {
    private int runDistance;
    private int wallHeight;
    private String name;

    public Robot(String name, int distance, int jumpHeight) {
        this.runDistance = distance;
        this.wallHeight = jumpHeight;
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " is running " + this.getRunDistance());

    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " is jumping " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.wallHeight;
    }
}
