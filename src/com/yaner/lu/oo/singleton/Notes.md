# Singleton 单例设计模式\

## 饿汉式
- 只允许一个实例存在，外部不可以随意通过构造器new 实例，所以首先将**构造器私有化**
- 构造器私有化后，必须在类加载时同时实例化一个对象，也就是用static
- 提供一个公共的get方法返回new出来的实例
```
class Singleton1{
    
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {} 
    
    public static Singleton1 getInstance() {
        return instance;
    }
}
```
## 懒汉式
- 构造器私有化
- 实例在用时才被创建
- 在get方法里判断
- 存在多线程安全问题⚠️
```
class Signleton2{
    private static Singleton2 instance = null;

    pirivate Singleton2() {}
    
    public static Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
```