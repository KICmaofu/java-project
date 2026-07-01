// Person 类表示一个简单的人员对象，包含姓名和年龄两个属性。
public class Person {
    // 私有字段：封装对象属性，防止直接外部访问。
    private String name;
    private int age;

    // 构造函数：创建 Person 对象时初始化名称和年龄。
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取姓名的方法。用于读取私有字段 name。
    public String getName() {
        return name;
    }

    // 设置姓名的方法。用于修改私有字段 name。
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄的方法。用于读取私有字段 age。
    public int getAge() {
        return age;
    }

    // 设置年龄的方法。用于修改私有字段 age。
    public void setAge(int age) {
        this.age = age;
    }

    // 对象行为：打印自我介绍内容。
    public void introduce() {
        System.out.println("Hello, I'm " + name + ", age " + age);
    }
}
