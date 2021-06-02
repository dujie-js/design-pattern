package com.js.lazy;

public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazy == null) {
                    lazy = new LazySimpleSingleton();
                }
            }
        }
        return lazy;
    }
}
