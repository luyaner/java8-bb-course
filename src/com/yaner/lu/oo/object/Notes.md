# Object类 
- 所有类的父类
- 没有属性
- Object子类可以继承Object类所有方法，并重写

## == 运算符
- 可以用于比较两个基本数据类型的**值**是否相等
- 也可以用于比较两个引用数据类型，但是用于比较两个引用数据类型时，注意比较的是两个引用数据类型的**地址值**是否相等

## Object类的方法

### equals()
- `public boolean equals(Object obj) {};`只用于比较两个对象的**地址值**是否相等 
- 注意这里的参数就是多态参数的引用 ^
- String类的`equals()`是例外，比较的是字符串里的每个字符是否相等，因为String类继承了Object类但是重写了`equals()`方法
- ⚠️以后比较两个字符串要用`equals()`方法比较

### toString()
- `public String toString() {};`
- ⚠️当直接打印输出对象时，实际上调用的就是其`toString()`方法，所有`sout(对象)`和`sout(对象.toString())`的结果是一样的
- `toString()`返回值的格式为`getClass().getName() + '@' + Integer.toHexString(hashCode());`