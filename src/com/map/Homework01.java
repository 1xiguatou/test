package com.map;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        Journalism news1 = new Journalism("新冠确诊病例超过千万,数百万印度信徒徒付恒河”圣裕“引民众担忧");
        Journalism news2 = new Journalism("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);
        System.out.println(news1.getTitle());
        for (int i = arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }

    }
}

class Journalism{
    private String title;
    private String content;

    public Journalism(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {

        if (title.length()>15){
            return title.substring(0,15)+"...";
        }
        return title;
    }
}