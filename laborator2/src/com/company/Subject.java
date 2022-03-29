package com.company;

public class Subject
{
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher)
    {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public int getRoom()
    {
        return room.getNumber();
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public int getNoOfStudents()
    {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents)
    {
        this.noOfStudents = noOfStudents;
    }

    public String getTeacher()
    {
        return teacher.getName();
    }

    public void setTeacher(Person teacher)
    {
        this.teacher = teacher;
    }

    
}
