package ru.evendot.Memory;

// Интерфейс памяти (Гарвардская архитектура)

public interface Memory {
    public char read(int address); // Прочитать
    public void write(int address, char value); // Записать значение
}
