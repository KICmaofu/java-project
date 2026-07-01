// 基础类：Animal 表示一种通用动物行为。
// 这是一个父类，子类可以继承它并重写 speak() 方法。
class Animal {
    // 在父类中定义一个通用的说话行为。
    public void speak() {
        System.out.println("Animal is making a sound");
    }
}

// Dog 是 Animal 的子类，表示具体的动物类型。
// 它继承了 Animal 的行为，并重写了 speak() 方法。
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog says: wang wang");
    }
}

// Cat 也是 Animal 的子类，表示另一种具体动物类型。
// 通过重写父类的方法，实现自己的行为。
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat says: miao miao");
    }
}

public class Main {
    public static void main(String[] args) {
        // 多态示例：父类类型引用指向不同子类实例
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // 调用 speak() 时，会根据实际对象类型执行具体实现。
        a1.speak(); // 输出 Dog says: wang wang
        a2.speak(); // 输出 Cat says: miao miao

        // 创建 Person 对象，演示对象的构造与方法调用。
        Person p = new Person("小明", 20);
        p.introduce(); // 让对象自我介绍

        // 修改对象属性后再次读取，演示封装与访问器方法。
        p.setAge(21);
        System.out.println("Updated age: " + p.getAge());
    }
}
