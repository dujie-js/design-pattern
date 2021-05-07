package com.js.normal;

import com.js.normal.adapter.PassportForThirdAdapter;
import com.js.normal.interfaces.IPassportForThird;

public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("asasasasasasa");
    }
}
