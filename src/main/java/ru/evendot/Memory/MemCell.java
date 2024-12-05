package ru.evendot.Memory;

// Ячейка памяти
public interface MemCell {
    
    public char read(); // Чтение из ячейки

    
    public void write(char value); // Запись в ячейку
}
