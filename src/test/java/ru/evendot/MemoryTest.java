package ru.evendot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import ru.evendot.Memory.DataMemory;
import ru.evendot.Memory.InstructionMemory;

public class MemoryTest {
    /**
     * Проверка создания памяти для данных
     */
    @Test
    void dataMemoryCreationTest(){
        DataMemory dataArr = new DataMemory();
        assertNotNull(dataArr.getConstantMemory());
    }
    /**
     * Проверка создания памяти для инструкций
     */
    @Test
    void instructionMemoryCreationTest(){
        InstructionMemory instrMem = new InstructionMemory();
        assertNull(instrMem.getInstructionMemory());
    }
    
}
