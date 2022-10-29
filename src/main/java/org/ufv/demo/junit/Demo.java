package org.ufv.demo.junit;

public class Demo {
    int atributo1;
    String atributo2;

    public Demo(){
        atributo1=0;
        atributo2="";
    }

    public Demo(int at1, String at2){
        atributo1=at1;
        atributo2=at2;
    }

    public int suma3att1(){
        atributo1 += 3;
        return atributo1;
    }

}
