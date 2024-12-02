package ru.evendot;

import javax.naming.NameNotFoundException;

import lombok.Getter;

@Getter
public enum CommandTypes {
    
    LDA(0),   // Загрузка данных в аккумулятор с переданного типа адресации по конкретному адресу
    STA(1),  // Сохранение данных аккумулятора в память по переданному типу адресации
    ADD(2),   // Сложение
    INC(3),   // Увеличение значения операнда на 1 и сохранение результата по тому же адресу;
    JZ(4),   // Условный переход (если предыдущее сравнение равно нулю)
    CMP(5),   // Сравнение
    SUB(6),  // Вычитание
    JMP(7),  // Безусловный переход
    OUT(8),  // Вывод в консоль значения
    DEC(9),  // Уменьшение значения операнда на 1 и сохранение результата по тому же адресу;
    DIV(10),  // Деление значения аккумулятора на операнд
    MUL(11),  // Умножение значения аккумулятора на операнд
    SQRT(12),  // Нахождение квадратного корня из операнда и запись в аккумулятор
    JL(13),  // Условный переход (если в результате предыдущего сравнения значение аккумулятора меньше операнда)
    JNZ(14),  // Условный переход (если предыдущее сравнение не равно нулю)
    HLT(15);  // Выход
    
    private final int code;
    CommandTypes(int code) {
        this.code = code;
    }
    
    public static CommandTypes commandType(int code){
        try{
            for (CommandTypes command : CommandTypes.values()){
                if(command.code == code){
                    return command;
                }
            }
        }
        catch (NameNotFoundException e){
            System.out.println("Unknown command name");
        }
    }
}
