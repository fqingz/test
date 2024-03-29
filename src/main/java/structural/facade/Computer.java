package structural.facade;

/**
 * @author Fang Qing
 * @date 2019/5/29 11:12
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU ( );
        memory = new Memory ( );
        disk = new Disk ( );
    }

    public void startup() {
        System.out.println ("start the computer!");
        cpu.startup ( );
        memory.startup ( );
        disk.startup ( );
        System.out.println ("start computer finished!");
    }

    public void shutdown() {
        System.out.println ("begin to close the computer!");
        cpu.shutdown ( );
        memory.shutdown ( );
        disk.shutdown ( );
        System.out.println ("computer closed!");
    }
}
