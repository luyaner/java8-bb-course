# final 关键字
修饰类，变量，方法
- 修饰类时，类不能被继承
- 修饰方法时，方法不能被重写
- 修饰变量时，即为常量，一旦被赋值不能再被赋值
  - 常量命名规范：全大写，单词之间用"_"隔开
  - 常量在定义的同时必须赋初始值(三种方法：直接显式赋值，构造器，代码块)
    - 如果用构造器为常量赋初始值，必须⚠️保证每个构造器都为常量赋值
        ```
      class Person {
        final int AGE;
      
        public Person() {
            this.AGE = 100;
      }
      
        public Person(int age) {
            this.AGE = age;
      }
      }
      ```
- 这种情况需要注意⚠️
    ```
  class Person {
    int age;
  }
  
  public static void show(final Person person) {
    person.age++; // this will work
    person = new Person(); // this will NOT work!! cause person is final 
  }
  
  // But if age is final then situation changes: 
  class Person {
    final int AGE;
  }
  public static void show(Person person) {
    person.AGE++; // this will NOT work
  }
      
    ```
