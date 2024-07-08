// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.
package homework_6;

import java.util.Objects;

/**
 * Laptop
 */
public class Laptop {

    private int RAM;
    private int SDD;
    private final Color color;
    private final OperationSystem operationSystem;

    public Laptop(int RAM, int SDD, Color color, OperationSystem operationSystem1) {
        this.RAM = RAM;
        this.SDD = SDD;
        this.color = color;
        this.operationSystem = operationSystem1;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }

    public int getSDD() {
        return SDD;
    }

    public void setSDD(int sDD) {
        SDD = sDD;
    }

    public Color getColor() {
        return color;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    @Override
    public String toString() {
        return "Random Acces Memory: " + RAM + "; " + "Solid-Static Drive " + SDD + "; " + "Color: " + color + "; " + "Operating system: " + operationSystem + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;

        return RAM == laptop.RAM && SDD == laptop.SDD && color.equals(laptop.color) && operationSystem.equals(laptop.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RAM, SDD, color, operationSystem);
    }
}
