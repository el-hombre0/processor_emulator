package ru.evendot;

import ru.evendot.Memory.MemCell;
import ru.evendot.Memory.Memory;

public class Cpu {
    public Memory dataMemory;
    public Memory instructionsMemory;
    
    public Cpu(Memory dataMemory, Memory instructionsMemory){
        this.dataMemory = dataMemory;
        this.instructionsMemory = instructionsMemory;
    }

    // private MemCell defineMemoryCell(){
    //     return 
    // }
}
