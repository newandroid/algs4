package com.css;

import com.css.algs4.UF;

public class Main {

    public static void main(String[] args) {
        UF uf = new UF(10);
        uf.union(4, 3);
        uf.union(3, 2);
        System.out.println("find:" + uf.find(3));
        System.out.println("connected:" + uf.connected(4, 3));
        System.out.println("count:" + uf.count());
    }
}
