package com.github.hcsp.datatype;

public class Main {
    // 实现一个"天花板除法"，即：
    // 若a能被b整除，返回a/b的值
    // 否则，返回a除以b向上取整的结果
    // 例如，ceilDivide(10,5) == 2
    // ceilDivide(3,2) == 2
    // ceilDivide(5,2) == 3
    public static int ceilDivide(int a, int b) {
        if (a % b == 0)
            return a / b;
        return a / b + 1;
    }
}
