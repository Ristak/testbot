package com.lby.boot.model;

public class User
{
    private String name;

    private int age;
    //获取名称
    public String getName()
    {

        return name;
    }
    //设置User的名称
    public void setName(String name)
    {

        this.name = name;
    }
    //通过Id来设置User的年龄
    public void setAgeById(int age)
    {
        this.age = age;
    }

    //获取User的年龄
    public int getAge()
    {

        return age;
    }
}