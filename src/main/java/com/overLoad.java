package com;

public class overLoad {
    public static void main(String[] args) {
        Persons ming = new Persons();
        Persons hong = new Persons();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }

}
class Persons{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name, String name2){
        this.name = name+" "+name2;
    }
}