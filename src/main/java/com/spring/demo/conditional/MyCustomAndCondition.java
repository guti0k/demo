package com.spring.demo.conditional;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.context.annotation.Conditional;

public class MyCustomAndCondition extends AllNestedConditions {
    public MyCustomAndCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    /*
      Bạn phải định nghĩa các Điều kiện bên trong class
      kế thừa AllNestedConditions
       */
    @Conditional(MyCustomCondition.class)
    public class RunOnWindow {

    }

    /*
   Lúc này, cả 2 điều kiện Window và Mac sẽ được kết hợp vs
   nhau khi kiểm tra, nếu thoả mãn cả 2 là đc
    */
    @Conditional(MyCustomCondition2.class)
    public class RunOnMac {
    }
}
