public class Radio implements Radio_enginerings{
    public void executeAM(){
        System.out.println("Amplitude modulation...");
    }
    public void executeFM(){
        System.out.println("Frequency modulation...");
    }
    public void executePM(){
        System.out.println("Phase modulation...");
    }

    public void workWithAnonym(Radio_enginerings iface){
        iface.executeAM();
        iface.executeFM();
        iface.executePM();
            }
        }
