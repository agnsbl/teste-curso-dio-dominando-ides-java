package com.dio.primeiro;

import model.gato;

public class primeiroprograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);

        livro livro = new livro("mariana", 100);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a + b));*/
    }

}
class livro {
    private String name;
    private Integer numPag;

    public livro (String name, Integer numPag) {
        this.name = name;
        this.numPag = numPag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "name='" + name + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}
