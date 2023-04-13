package com.srz.pkg.Object_;

public class ToString {

    /**
     * Object中的toString()源码
     * 1.getClass().getName() 类的全类名（包名+类名）
     * 2.Integer.toHexString(hashCode()) 将对象的hashcode值 转成16进制的字符串
     *
     * public String toString() {
     * return getClass().getName() + "@" + Integer.toHexString(hashCode());
     * }
     *
     */
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山", 100);
        System.out.println(monster.toString());

        //当直接输出一个对象时会默认调用toString
        System.out.println(monster);
    }




}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    //重写toString 方法 输出对象的属性
    //使用快捷键 Alt + p -> insert

    //默认重写后 把对象的属性返回
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}