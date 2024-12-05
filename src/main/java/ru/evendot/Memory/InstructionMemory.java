package ru.evendot.Memory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

// Память для инструкций
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InstructionMemory implements Memory{
    private char[] instructionMemory;

    @Override
    public char read(int address){
        return this.instructionMemory[address];
    }
    @Override
    public void write(int address, char value){
        this.instructionMemory[address] = value;
    }
}
