package dataType;

/**
 * @author:
 * @DATE: 2021/2/21
 */
public class Student {

    // 成员
    public String name;
    public int age;

    /* 构造函数
     1. 构造函数名必须与类名相同
     2. 构造函数没有返回值
     3. 如果没有写构造函数，Java会自动为你生成一个没有参数的构造函数
     4. 如果自己写类构造函数，则Java不再自动为你生成构造函数
    */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void printContent() {
        System.out.println("name: " + this.name + "\n" + "age: " + this.age);
    }

    public static void main(String[] args) {
        // 1. 创建一个Student 引用类型对象
        // 2. s 为该对象的引用
        // 3. 创建Student对象时会调用Student类中的构造函数
        Student s = new Student("暑月", 21);

        // 获取s 对象中成员数据
        System.out.println("获取s 对象中成员数据，name: " + s.name + "\t" + "age: " + s.age);

        System.out.println("--------------------------");
        s.printContent(); // 调用该对象中的方法
    }
}