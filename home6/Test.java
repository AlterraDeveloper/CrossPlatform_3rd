public class Test{
public static void main(String[] args) {
    Radio radio = new Radio();
    radio.executeAM();
    radio.executeFM();
    radio.executePM();
    radio.workWithAnonym(new Radio_enginerings(){
        public void executeAM(){
            System.out.println("Amplitude modulation...marker");
        }
        public void executeFM(){
            System.out.println("Frequency modulation...marker");
        }
        public void executePM(){
            System.out.println("Phase modulation...marker");
        }
    });
}
}
