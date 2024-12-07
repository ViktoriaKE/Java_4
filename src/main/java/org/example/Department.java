package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий департамент.
 */
public class Department {
    private String name; // Название департамента
    private List<Person> employees; // Список сотрудников департамента

    /**
     * Конструктор для создания департамента.
     *
     * @param name Название департамента
     */
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    /**
     * Возвращает название департамента.
     *
     * @return Название департамента
     */
    public String getName() {
        return name;
    }

    /**
     * Добавляет сотрудника в департамент.
     *
     * @param person Сотрудник
     */
    public void addEmployee(Person person) {
        employees.add(person);
    }

    /**
     * Возвращает список сотрудников департамента.
     *
     * @return Список сотрудников
     */
    public List<Person> getEmployees() {
        return employees;
    }

    /**
     * Возвращает строковое представление объекта Department.
     *
     * @return Строка, описывающая департамент
     */
    @Override
    public String toString() {
        return "Department{name='" + name + "', employees=" + employees + "}";
    }
}