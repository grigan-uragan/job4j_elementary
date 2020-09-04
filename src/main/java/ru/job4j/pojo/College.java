package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stepan = new Student();
        stepan.setFio("Ivanov Stepan Arckadievich");
        stepan.setGroup(1);
        stepan.setReceipt(new Date());
        System.out.println(stepan.getFio());
        System.out.println(stepan.getGroup());
        System.out.println(stepan.getReceipt());
    }
}
