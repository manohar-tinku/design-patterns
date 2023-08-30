package com.pov.design.patterns.structural.fascade;

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

    private static final long BOOT_ADDRESS = 12345L;
    private static final long BOOT_SECTOR = 9876L;
    private static final int SECTOR_SIZE = 1024;
}
