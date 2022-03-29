package com.company;

public class Person
{
    private String name;
    private String surname;
    private int age;
    private long identityNo;

    public Person() { }

    public Person(String name, String surname, int age, long identityNo)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNo = identityNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public long getIdentityNo()
    {
        return identityNo;
    }

    public void setIdentityNo(long identityNo)
    {
        this.identityNo = identityNo;
    }
}
