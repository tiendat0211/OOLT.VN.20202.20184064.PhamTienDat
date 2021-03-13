public class Aims {
    public static void main(String[] args){
        Order anOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception",
                "Animation, Science Fiction", "Christopher Nolan", 148, 45.5f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tenet",
                "Animation, Science Fiction", "George Lucas", 150, 23f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers 4: Endgame",
                "Animation, Science Fiction","Anthony Russo, Joe Russo", 181, 50f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Conjuring",
                "Horror","James Wan", 112, 30f);
        anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Thor 3: Ragnarok",
                "Animation, Adventure","Taika Waititi", 130 ,20.5f);
        anOrder.addDigitalVideoDisc(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Hacksaw Ridge",
                "Historical","Mel Gibson", 139 ,30.7f);
        anOrder.addDigitalVideoDisc(dvd6);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Pearl Harbor",
                "Historical","Micheal Bay", 183 ,25f);
        anOrder.addDigitalVideoDisc(dvd7);

        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd6);

        System.out.print("Total Cost is: " + anOrder.totalCost() + "$.");


    }
}
