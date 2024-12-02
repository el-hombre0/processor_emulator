package ru.evendot.Register;

import lombok.Data;
/**
 * Описание регистра
 */
@Data
public class Register {
    private char value;
    public void sumValue(){
        this.value += value;
    }
}
