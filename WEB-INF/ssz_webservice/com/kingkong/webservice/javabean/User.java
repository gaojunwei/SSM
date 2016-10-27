package com.kingkong.webservice.javabean;


public class User {
private long  id;
private String
name;
private int  age;


/**
* @param id
* @param name
* @param age
*/
public User(long id, String name, int age) {
super();
this.id = id;
this.name = name;
this.age = age;
}


public long getId() {
return id;
}


public void setId(long id) {
this.id = id;
}


public String getName() {
return name;
}


public void setName(String name) {
this.name = name;
}


public int getAge() {
return age;
}


public void setAge(int age) {
this.age = age;
}


@Override
public String toString() {
return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
}
}