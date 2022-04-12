public class Cat implements Players{
    private int runDistance;
    private int wallHeight;
    private String name;

    public Cat(String name, int run, int jump) {
        this.runDistance = run;
        this.wallHeight = jump;
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " is running " + this.getRunDistance());

    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " is jumping " + this.getJumpHeight());
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