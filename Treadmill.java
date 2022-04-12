import java.sql.SQLOutput;

public class Treadmill extends Barriers {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }
    public int getLength(){
        return length;
    }

    @Override
    protected boolean moving(Players player) {
        System.out.println("The treadmill distance:" + this.length);
        player.run();

        if (getLength() <= player.getRunDistance()) {
            System.out.println("Дистанция преодолена");
            return true;
        } else {
            System.out.println("Дистанция не преодолена");
            return false;
        }
    }
}
