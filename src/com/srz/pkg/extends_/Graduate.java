package com.srz.pkg.extends_;

public class Graduate {
    public String name;
    public int age;
    private int score;

    public Graduate() {
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void testing(){ //和小学生不一样
        System.out.println("大学生 " +name +"正在考数学" );
    }
    public void showInfo(){
        System.out.println("学生 " + name + " 年龄" + age + " 成绩" + score);

    }
}
