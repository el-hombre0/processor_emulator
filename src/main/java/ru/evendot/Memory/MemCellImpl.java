package ru.evendot.Memory;

import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Supplier;
// Реализация ячейки памяти
@RequiredArgsConstructor
public class MemCellImpl implements MemCell {
    private final Supplier<Character> reader; // Выдает значение
    private final Consumer<Character> writer; // Принимает значение

    @Override
    public char read() {
        return reader.get();
    }

    @Override
    public void write(char value) {
        writer.accept(value);
    }
}
