package ru.evendot.Memory;
/*
 * Память (Гарвардская)
 */
public interface Memory {
    public char read(int address);
    public void write(int address, char value);
}
