# 多态性 Polymorphism

## 是什么❓
- 一种事物的多种表现形态

## 体现在❓
- 方法的重载和重写
- 对象的多态性
  - 本类的引用指向本类的对象 -> **本态** `Man man = new Man();`
  - 父类的引用指向子类的对象 -> **多态** 
  ```
  Person person = new Man();
  person.eat();
  person.walk();
  
  person.smoking(); // smoking方法是子类Man特有的方法；这里会标红因为编译过不去，因为多态分两种状态👇
  ```
    - 在多态的情况下，编译时："看左边"，看到的是父类的引用（而父类中不存在子类特有的方法）
                    运行时："看右边"，看到的是子类的对象（实际运行的是子类重写父类的方法）
                                ————————这个过程成为**虚拟方法调用（动态绑定）**

## 引用数据类型的转换
- 向上转型：子类转父类，系统自动完成
- 向下转型：父类转子类，需要使用强转符"（需要转换的类型）"
  ```
  Person person = new Man();
  person.eat();
  person.walk();

  // person.smoking(); // smoking方法是子类Man特有的方法；这里会标红因为编译过不去，进行向下强转：
  Man man = (Man)person;
  man.smoking(); // 这时子类中特有的方法就可以被成功编译，调用了
  ```
  
## 属性不具备多态性
```
// 当父类和子类中拥有同名属性，且显示赋值不同时，父类的引用指向子类对象时调用该属性，会返回父类的属性值
class TestProperty {
    public static void main (String[] args) {
        Father f = new Son();
        System.out.println(f.num); // 10
    } 
}

class Father {
    private int num = 10;
}
class Son extends Father {
    private int num = 20;
}
```

## 多态的应用
1. 多态数组
    ```
   // 假设Son是Father的子类
    Father[] father  = new Father[5];
    father[0] = new Father();
   father[1] = new Son();   
   ```