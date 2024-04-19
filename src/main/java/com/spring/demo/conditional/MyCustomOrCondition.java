package com.spring.demo.conditional;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

public class MyCustomOrCondition extends AnyNestedCondition {

    public MyCustomOrCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }
    /*
       Bạn phải định nghĩa các Điều kiện bên trong class
       kế thừa AnyNestedCondition
        */
    @Conditional(MyCustomCondition.class)
    public class RunOnWindow {

    }

    /*
   Lúc này, cả 2 điều kiện Window và Mac sẽ được kết hợp vs
   nhau khi kiểm tra, nếu thoả mãn 1 trong 2 là đc
    */
    @Conditional(MyCustomCondition2.class)
    public class RunOnMac {
    }
}
