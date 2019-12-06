package com.newler.studymemory;

/**
 * @author newler
 * @what
 * @date 2018/9/2
 */
public class A {
    private B b;
    private C c;

    public A(D d) {
        b = new B(d);
        c = new C(d);
    }
}

class B {
    private D d;

    public B(D prams) {
        this.d = prams;
    }
}

class C {
    private D d;
    public C(D prams) {
        this.d = prams;
    }
}

class D {
    private E e = new E();
}

class E {
   private int i;
}
