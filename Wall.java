public class Wall extends Barriers {
    private int height;


    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeight(){
        return  height;
    }


    @Override
    protected boolean moving(Players player) {
        System.out.println("The wall height: " + this.height);
        player.jump();

        if (getHeight() <= player.getJumpHeight()){
            System.out.println("Удачный прыжок");
            return true;
        } else {
            System.out.println("Неудачный прыжок");
            return false;
        }

    }
}

