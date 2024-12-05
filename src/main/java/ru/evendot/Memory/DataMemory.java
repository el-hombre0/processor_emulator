package ru.evendot.Memory;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// Память для данных
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataMemory implements Memory {
    private final int SIZE = 1024;
    private char[] constantMemory = new char[SIZE];

    @Override
    public char read(int address){
        return this.constantMemory[address];
    }

    @Override
    public void write(int address, char value){
        this.constantMemory[address] = value;
    }

}
