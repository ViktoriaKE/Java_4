package org.example;
/**
 * Класс, представляющий человека.
 */
public class Person {
    private String name; // Имя человека
    private int age; // Возраст человека
    private String department; // Название департамента, в котором работает человек

    /**
     * Конструктор для создания объекта Person.
     *
     * @param name       Имя человека
     * @param age        Возраст человека
     * @param department Название департамента
     */
    public Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    /**
     * Возвращает имя человека.
     *
     * @return Имя
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает возраст человека.
     *
     * @return Возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Возвращает название департамента.
     *
     * @return Департамент
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Возвращает строковое представление объекта Person.
     *
     * @return Строка, описывающая объект
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}