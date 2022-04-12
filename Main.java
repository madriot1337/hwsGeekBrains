public class Main {
    public static void main(String[] args) {

Players[] participants = new Players[3];
        participants[0] = new Human("John",100,100);
        participants[1] = new Cat("Max",44,65);
        participants[2] = new Robot("R2D2",1000, 200);

Barriers[] trials = new Barriers[3];
        trials[0] = new Treadmill("treadmill", 40);
        trials[1] = new Wall("wall", 77);
        trials[2] = new Treadmill("treadmill", 50);

        for (int i = 0; i < participants.length; i++) {
            boolean result = true;
            System.out.println("--------------------" + participants[i] + "-------------------------");
            for (int j = 0; j < trials.length; j++) {
                result = trials[j].moving(participants[i]);
                System.out.println("_____________");




                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("!! Испытания успешно пройдены !!");
            } else {
                System.out.println("!! Испытания не пройдены !!");
            }

        }


    }
}
