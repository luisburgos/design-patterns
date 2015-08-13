package facade.examples.computer;

/**
 * Created by luisburgos on 12/08/15.
 */
public class ComputerFacade {

    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(){
        this.cpu       = new CPU();
        this.hardDrive = new HardDrive();
        this.memory    = new Memory();
    }

    public void start(){
        System.out.println("STARTING...");
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();
    }

}
