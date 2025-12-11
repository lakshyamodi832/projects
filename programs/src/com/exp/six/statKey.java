package com.exp.six;

public class statKey {
    static void main() {
        stats s1 = new stats(69);

        s1.display();
    }
}

class stats{
    int exp;
    static int stat = 12;

    stats(){

    }

    stats(int exp){
        this.exp = exp;
    }

    void display(){
        System.out.println(exp);
        System.out.println(stat);
    }
}