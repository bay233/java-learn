# Java基础教程

> 教程中大部分内容来自菜鸟教程 https://www.runoob.com/java/java-tutorial.html



## 安装JDK（配置Java运行环境）

>  https://www.runoob.com/java/java-environment-setup.html



## 第一个Java程序

### 打印 Hello World

创建一个HelloWorld.java文件，将以下内容拷贝到文件中

```java
public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```

使用指令编译执行HelloWorld文件中程序

```shell
javac HelloWorld.java  # 将Java文件编译成能够执行的Java字节码
java HelloWorld.class  # 执行Java字节码程序
```



### 程序结构

```java
public class HelloWorld {}  // 声明一个类
```

* public 修饰符，每一个Java文件必须且有且只有一个public修饰的类
* class 关键字，指明这是一个类
* HelloWorld 类名称
* {} 类中包含的内容

```java
public static void main(String[] args) {}  // 声明一个main函数
```

* public 修饰符
* static 关键字，指明这是一个静态方法
* void 函数的返回值，void表示没有返回值
* main 函数名，程序执行开始的函数，每一个Java程序都是从main函数开始执行
* String[] args 参数，声明args 是一个字符串数组类型
* {} 函数包含的内容

```java
System.out.println("Hello World"); // main函数中执行的语句
```

* System.out.println() 表示一个函数调用，System：系统调用，out：输出，println()：将内容打印并换行
* "Hello World" 字符串，打印的内容
* ; 最后的一个分号表示这句话结束，每一条完整的语句后面都需要 ; 表示结束

```java
/* 第一个Java程序
 * 它将输出字符串 Hello World
 */

/* 这是一个块注释，多行注释
*/

// 这是一个行注释
```

* 注释，不会被编译器翻译，主要用于标示，帮助阅读代码



## 基础语法

### 基本语法

编写 Java 程序时，应注意以下几点：

- **大小写敏感**：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
- **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 **MyFirstJavaClass** 。
- **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- **源文件名**：源文件名必须和public类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 **.java**。（如果文件名和类名不相同则会导致编译错误）。
- **主方法入口**：所有的 Java 程序由 **public static void main(String[] args)** 方法开始执行。



### Java 标识符

Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

关于 Java 标识符，有以下几点需要注意：

- 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
- 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或***数字***的任何字符组合
- 关键字不能用作标识符
- 标识符是大小写敏感的
- 合法标识符举例：age、$salary、_value、__1_value
- 非法标识符举例：123abc、-salary



### Java修饰符

像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：

- 访问控制修饰符 : default, public , protected, private
  - **default** (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法
  - **private** : 在同一类内可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**
  - **public** : 对所有类可见。使用对象：类、接口、变量、方法
  - **protected** : 对同一包内的类和所有子类可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**
- 非访问控制修饰符 : final, abstract, static, synchronized



## Java数据类型

Java 的两大数据类型:

- 基本数据类型
- 引用数据类型



### 基本数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

> 一个字节表示8个bit位

#### 整型

只能表示整数，如 0，100， -10 等

**byte：**字节类型，一个字节，表示的范围是**-128～127**，例：```byte b = 100```

**short：**短整型，两个字节，**-2^15～2^15 - 1**，例：```short s = 100```

**int：**整型，四个字节，**-2^31～2^31 - 1**，例：```int i = 100```

**long：**长整型，八个字节，**-2^63～2^63 -1**，例：```long L = 100L```

例：

| 数字 | byte     | short             | int                                 |
| ---- | -------- | ----------------- | ----------------------------------- |
| 12   | 00001100 | 00000000 00001100 | 00000000 00000000 00000000 00001100 |
| -12  | 10001100 | 10000000 00001100 | 10000000 00000000 00000000 00001100 |

#### 浮点型

表示小数的类型，只能表示小数，如果有效位数过多可能导致数据精度丢失

**float：**单精度，四个字节，例：```float f = 100.0f```

**double：**双精度，八个字节，例：```double d = 100.0```

> 小数存储比整有些许复杂，有兴趣的可参考https://blog.csdn.net/kongmin_123/article/details/82052840

#### 布尔型

**boolean：**布尔型，只占一个bit位，有两个值：**false**，**true**，例：```boolean b = true```

#### 字符类型

**char：**字符类型，两个字节，例：```char c = 'A'```



### 引用数据类型

在Java中除了基本数据类型外的所有数据类型都叫引用数据类型。

引用数据类型主要包括：数组，类（class），接口（interface）。

#### 数组

**数组：** 创建或分配多个相同数据类

```java
int[] arr1 = new int[10];  // 创建一个长度为10 的int类型数组
int[] arr2 = new int[]{1,2,3,4}; // 创建了一个长度为4的数组，且值分别为 1，2，3，4
/*
	创建数组要指明，[]中的值，且值是一个大于0的整数，如例1 
	或者在创建时直接为数组分配值，编译器会自动为数组创建相应的长度，如例2
*/

String[] strArr = new String[10]; // 创建引用类型数组
```



#### 类（class）

类可以看成是创建Java对象的模板，这个模版中由多个基本数据类型或引用类型组合而成，当然还有一些方法。

```java
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
```

##### String类

在Java中还有一个比较特殊的引用数据类型那就是String，虽然它是引用数据类型，但是又拥有一些基本数据的特性。

如：

```java
// 一般引用数据类型的声明都是使用xxx x = new xxx()
Student s = new Student();
ArrayList arrList = new ArrayList();

// 而String 类虽然是引用类型，但是可以像基本数据类型一样声明
String s1 = "String是特殊的";
String s2 = new String("String是特殊的");
// 这两种声明方式最后的值是相同的，但是 s1 是不等于 s2 的 
```



#### 接口（interface）

暂时先将它看成中特殊的类，与类不同但是又有联系，后续会详细讲解。



## 运算符

运算符分成以下几组：

- 算术运算符
- 关系运算符
- 位运算符
- 逻辑运算符
- 赋值运算符
- 其他运算符

### 算术运算符

表格中的实例假设整数变量A的值为10，变量B的值为20：

| 操作符 | 描述                              | 例子                               |
| :----- | :-------------------------------- | :--------------------------------- |
| +      | 加法 - 相加运算符两侧的值         | A + B 等于 30                      |
| -      | 减法 - 左操作数减去右操作数       | A – B 等于 -10                     |
| *      | 乘法 - 相乘操作符两侧的值         | A * B等于200                       |
| /      | 除法 - 左操作数除以右操作数       | B / A等于2                         |
| ％     | 取余 - 左操作数除以右操作数的余数 | B%A等于0                           |
| ++     | 自增: 操作数的值增加1             | B++ 或 ++B 等于 21（区别详见下文） |
| --     | 自减: 操作数的值减少1             | B-- 或 --B 等于 19（区别详见下文） |

代码示例

```java
public class Test1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );  // d++ 先返回d 的值再执行++操作
        System.out.println("++d   = " +  (++d) );  // ++d 先执行++操作再返回d 的值
    }
}
```



### 关系运算符

表格中的实例整数变量A的值为10，变量B的值为20：

| 运算符 | 描述                                                         | 例子             |
| :----- | :----------------------------------------------------------- | :--------------- |
| ==     | 检查如果两个操作数的值是否相等，如果相等则条件为真。         | （A == B）为假。 |
| !=     | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。     | (A != B) 为真。  |
| >      | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。   | （A> B）为假。   |
| <      | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。   | （A <B）为真。   |
| >=     | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。 |
| <=     | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。 |

关系运算符的结果为真则是**true**，假则是**false**

代码示例

```java
public class Test2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
}
```



### 位运算符

Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。

位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：

```
A = 0011 1100
B = 0000 1101
-----------------
A&B = 0000 1100
A | B = 0011 1101
A ^ B = 0011 0001
~A= 1100 0011
```

下表列出了位运算符的基本运算，假设整数变量 A 的值为 60 和变量 B 的值为 13：

| 操作符 | 描述                                                         | 例子                           |
| :----- | :----------------------------------------------------------- | :----------------------------- |
| ＆     | 如果相对应位都是1，则结果为1，否则为0                        | （A＆B），得到12，即0000 1100  |
| \|     | 如果相对应位都是 0，则结果为 0，否则为 1                     | （A \| B）得到61，即 0011 1101 |
| ^      | 如果相对应位值相同，则结果为0，否则为1                       | （A ^ B）得到49，即 0011 0001  |
| 〜     | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。         | （〜A）得到-61，即1100 0011    |
| <<     | 按位左移运算符。左操作数按位左移右操作数指定的位数。         | A << 2得到240，即 1111 0000    |
| >>     | 按位右移运算符。左操作数按位右移右操作数指定的位数。         | A >> 2得到15即 1111            |
| >>>    | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | A>>>2得到15即0000 1111         |

代码示例

```java
public class Test3 {
    
    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
```



### 逻辑运算符

假设布尔变量A为真（true），变量B为假（false）

| 操作符 | 描述                                                         | 例子                |
| :----- | :----------------------------------------------------------- | :------------------ |
| &&     | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。     | （A && B）为假。    |
| \| \|  | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A \| \| B）为真。 |
| ！     | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。  |

代码示例

```java
public class Test4 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
}
```



### 赋值运算符

下面是Java语言支持的赋值运算符：

| 操作符  | 描述                                                         | 例子                                     |
| :------ | :----------------------------------------------------------- | :--------------------------------------- |
| =       | 简单的赋值运算符，将右操作数的值赋给左侧操作数               | C = A + B将把A + B得到的值赋给C          |
| + =     | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数     | C + = A等价于C = C + A                   |
| - =     | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数     | C - = A等价于C = C - A                   |
| * =     | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数     | C * = A等价于C = C * A                   |
| / =     | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数     | C / = A，C 与 A 同类型时等价于 C = C / A |
| （％）= | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | C％= A等价于C = C％A                     |
| << =    | 左移位赋值运算符                                             | C << = 2等价于C = C << 2                 |
| >> =    | 右移位赋值运算符                                             | C >> = 2等价于C = C >> 2                 |
| ＆=     | 按位与赋值运算符                                             | C＆= 2等价于C = C＆2                     |
| ^ =     | 按位异或赋值操作符                                           | C ^ = 2等价于C = C ^ 2                   |
| \| =    | 按位或赋值操作符                                             | C \| = 2等价于C = C \| 2                 |

代码示例

```java
public class Test5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}
```



### 其他运算符

#### 条件运算符（?:）

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。

```java
variable x = (布尔表达式)? value1 : value2;
// 如果布尔表达式返回true 则x 的值赋值为value1，如果为false，则赋值为value2
```

代码示例

```java
public class Test6 {

    public static void main(String[] args){
        int a , b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );
    }
}
```



#### instanceof 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。

instanceof运算符使用格式如下：

```java
( Object reference variable ) instanceof  (class/interface type)
```

示例

```java
String name = "James";
boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
```



### Java运算符的优先级

下表中具有最高优先级的运算符在的表的最上面，最低优先级的在表的底部。

| 类别     | 操作符                                     | 关联性   |
| :------- | :----------------------------------------- | :------- |
| 后缀     | () [] . (点操作符)                         | 左到右   |
| 一元     | expr++ expr--                              | 从左到右 |
| 一元     | ++expr --expr + - ～ ！                    | 从右到左 |
| 乘性     | * /％                                      | 左到右   |
| 加性     | + -                                        | 左到右   |
| 移位     | >> >>>  <<                                 | 左到右   |
| 关系     | > >= < <=                                  | 左到右   |
| 相等     | == !=                                      | 左到右   |
| 按位与   | ＆                                         | 左到右   |
| 按位异或 | ^                                          | 左到右   |
| 按位或   | \|                                         | 左到右   |
| 逻辑与   | &&                                         | 左到右   |
| 逻辑或   | \| \|                                      | 左到右   |
| 条件     | ？：                                       | 从右到左 |
| 赋值     | = + = - = * = / =％= >> = << =＆= ^ = \| = | 从右到左 |
| 逗号     | ，                                         | 左到右   |

## 循环结构

Java中有三种主要的循环结构：

- **while** 循环
- **do…while** 循环
- **for** 循环

### while循环

while是最基本的循环，它的结构为：

```java
while( 布尔表达式 ) {
  //循环内容
}
```

只要布尔表达式为 true，循环就会一直执行下去。

代码示例

```.java
public class Test1 {

    public static void main(String args[]) {
        int x = 10;
        while( x < 20 ) {
            System.out.println("value of x : " + x );
            x++;
        }
    }
}
```

### do…while 循环

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

```java
do {
       //代码语句
}while(布尔表达式);
```

表达式判断在后面，也就是说一定是先执行一次循环代码再进行判断。

代码示例

```java
public class Test2 {

    public static void main(String args[]){
        int x = 20;

        do{
            System.out.println("value of x : " + x );
            x++;
        }while( x < 20 );
    }
}
```

x不满足while中的表达也会执行一次循环中的代码。

### for循环

for循环提供为循环额外提供了初始化，布尔表达式，更新的操作。

```java
for(初始化; 布尔表达式; 更新) {
    //代码语句
}
```

关于 for 循环有以下几点说明：

- 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
- 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。如果为空，则会一直默认为true。
- 执行一次循环后，更新循环控制变量。也可以为空。
- 再次检测布尔表达式。循环执行上面的过程。

示例代码

```java
public class Test3 {

    public static int init(){
        System.out.println("初始化语句");
        return 0;
    }
    public static boolean bool(){
        System.out.println("布尔表达式");
        return true;
    }

    public static int val(){
        System.out.println("更新变量");
        return 0;
    }

    public static void main(String args[]) {

        for(int x = 10, y = init(); x < 20 && bool(); x = x+1, y = val()) {
            System.out.println("value of x : " + x );
        }
    }
}
```

### 增强for循环

Java 增强 for 循环语法格式如下:

```java
for(声明语句 : 表达式){
   //代码句子
}
```

增强for循环可对数组和可迭代对象使用，可迭代对象是指实现了Iterator 接口的对象。

代码示例

```java
public class Test4 {

    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        System.out.println("循环数组");
        for(int x : numbers ){
            System.out.print( x + " ");
        }
        System.out.println("\n循环可迭代对象");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        for (Integer i : numberList) {
            System.out.print(i + " ");
        }
    }
}
```

### break关键字

break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

break 跳出最里层的循环，并且继续执行该循环下面的语句。

代码示例

```java
public class Test5 {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        // 嵌套for循环时，break只会跳出包含它最里面的for循环
        for (int i = 0; i < 3; ++i){
            System.out.println("i: " + i);
            System.out.print("j: ");
            for (int j = 0; ; ++j){
                System.out.print(j + " ");
                if (j > i * 2){
                    break;
                }
            }
            System.out.println();
        }

    }
}
```

### continue关键字

continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。

在 for 循环中，continue 语句使程序立即跳转到更新语句。

在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。

```java
public class Test6 {

    public static boolean bool(){
        System.out.println("布尔表达式");
        return true;
    }

    public static int val(){
        System.out.println("更新变量");
        return 0;
    }

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30};

        System.out.println("增强for循环中使用continue");
        for(int x : numbers ) {
            if( x == 20 ) {
                continue;
            }
            System.out.println( x );
        }

        System.out.println("\nfor循环中使用continue");
        for (int i = 0, j = 0; i < numbers.length && bool(); ++i, j = val()){
            if( numbers[i] == 20 ) {
                continue;
            }
            System.out.println( numbers[i] );
        }

        System.out.println("\nwhile循环中使用continue");
        int i = 0;
        while (i < numbers.length && bool()){
            int j = i;
            i++;
            if( numbers[j] == 20 ) {
                continue;
            }
            System.out.println( numbers[j] );
        }
    }
}

```

## 条件语句

条件语句主要有三种结构

* **if**语句
* **if...else**语句
* **if...else if...else**语句

### if语法

if 语句的语法如下：

```java
if(布尔表达式){
   //如果布尔表达式为true将执行的语句
}
```

如果布尔表达式的值为 true，则执行 if 语句中的代码块，否则执行 if 语句块后面的代码。

```java
public class Test1 {

    public static void main(String args[]){
        int x = 10;

        if( x < 20 ){
            System.out.print("这是 if 语句");
        }
    }
}
```



### if...else语句

if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行。

if…else 的用法如下：

```java
if(布尔表达式){
   //如果布尔表达式的值为true
}else{
   //如果布尔表达式的值为false
}
```

代码示例

```java
public class Test2 {

    public static void main(String args[]){
        int x = 30;

        if( x < 20 ){
            System.out.print("这是 if 语句");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}
```



### if...else if...else语句

if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况。

使用 if，else if，else 语句的时候，需要注意下面几点：

- if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后。
- if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。
- 一旦其中一个 else if 语句检测为 true，在它之下的 else if 以及 else 语句都将跳过执行。
- 如果前面所有的if 语句和else if 语句都检测为false才会执行最后的else 语句中的代码。

if...else 语法格式如下:

```java
if(布尔表达式 1){
   //如果布尔表达式 1的值为true执行代码
}else if(布尔表达式 2){
   //如果布尔表达式 2的值为true执行代码
}else if(布尔表达式 3){
   //如果布尔表达式 3的值为true执行代码
}else {
   //如果以上布尔表达式都不为true执行代码
}
```

代码示例

```java
public class Test3 {

    public static void main(String args[]){
        int x = 30;

        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}
```

条件判断语句是可嵌套的。

代码示例

```java
public class Test4 {

    public static void main(String args[]){
        int x = 30;
        int y = 10;

        if( x == 30 ){
            if( y == 10 ){
                System.out.print("X = 30 and Y = 10");
            }
        }
    }
}
```

## Java方法

前面提到过，一个Java类主要由成员，和方法组成。

* 成员也就是我们常见的变量，但是需要加上一些修饰符来控制它们的作用域和一些其他增强属性。
* 方法也可以称之为函数，方法是语句的集合，它们在一起执行一个功能。

```java
public class Student {
    // 成员
    public String name;
    public int age;

    // 以下都是方法
  
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }// 构造函数，是一种特殊的方法
    
    public void printContent() {
        System.out.println("name: " + this.name + "\n" + "age: " + this.age);
    }// 其他普通方法
}
```

### 方法的定义

方法包含一个方法头和一个方法体。下面是一个方法的所有部分：

- **修饰符：**修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
- **返回值类型 ：**方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字**void**。
- **方法名：**是方法的实际名称。方法名和参数表共同构成方法签名。
- **参数类型：**参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
- **方法体：**方法体包含具体的语句，定义该方法的功能。

![img](https://www.runoob.com/wp-content/uploads/2013/12/D53C92B3-9643-4871-8A72-33D491299653.jpg)

代码示例

```java
import java.util.Random;

public class Test1 {
    private Random rd;

    public Test1(){
        System.out.println("调用构造函数");
        this.rd = new Random();
    }

    public void fun1(){
        System.out.println("调用无放回值函数");
    }

    public int fun2(){
        System.out.println("调用int 返回值类型函数");
        return rd.nextInt(100);
    }

    public int fun2(int range){
        System.out.println("调用fun2的重载函数函数");
        return rd.nextInt(range);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.fun1();
        int i = t.fun2();
        System.out.println("fun2 的返回值为: " + i);

        int j = t.fun2(10);
        System.out.println("fun2 的重载函数返回值为: " + j);
    }
}

```



# 集合框架

在Java的java.util 包中，Java为我们提供了一些常用数据结构的封装。

![img](https://www.runoob.com/wp-content/uploads/2014/01/2243690-9cd9c896e0d512ed.gif)

图片中加黑边框中的类是最常用的几个类，ArrayList（数组列表），LinkedList（链表），HashMap（哈希map），HashSet（哈希集合）。

**基本类型对应的包装类表如下：

| 基本类型 | 引用类型  |
| :------- | :-------- |
| boolean  | Boolean   |
| byte     | Byte      |
| short    | Short     |
| int      | Integer   |
| long     | Long      |
| float    | Float     |
| double   | Double    |
| char     | Character |

## ArrayList

ArrayList 是List的一个实现类，也是最常用的List类。ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。

ArrayList中常用的方法

* **add() ** 添加元素
* **get() ** 获取元素
* **set() ** 修改元素
* **remove() ** 删除元素
* **size()**  计算元素数量

示例代码

```java
import java.util.ArrayList; // 引入ArrayList类

public class Test1 {

    public static void main(String[] args) {
        // 创建一个ArrayList 
        ArrayList<String> sites = new ArrayList<String>();
        // 添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // 打印元素
        System.out.println(sites);

        // 获取元素
        System.out.println(sites.get(1));

        // 修改元素
        sites.set(1, "Wiki");
        System.out.println(sites);

        // 删除元素
        // 根据下标删除元素
        sites.remove(1);
        System.out.println(sites);
        // 根据元素内容删除元素
        sites.remove("Weibo");
        System.out.println(sites);

        // 计算大小，也就是列表中的元素数量
        System.out.println("sites中元素的数量:" + sites.size());


        sites.add("Spring");
        sites.add("Apache");

        // 列表的迭代
        System.out.print("使用for循环:");
        for (int i = 0; i < sites.size(); ++i){
            System.out.print(sites.get(i) + " ");
        }
        System.out.print("\n使用增强for循环:");
        for (String s: sites){
            System.out.print(s + " ");
        }
        System.out.print("\n使用forEach:");
        sites.forEach(s -> System.out.print(s + " "));
    }

}

```

其他常用方法

| 方法                                                         | 描述                                          |
| :----------------------------------------------------------- | :-------------------------------------------- |
| [add()](https://www.runoob.com/java/java-arraylist-add.html) | 将元素插入到指定位置的 arraylist 中           |
| [addAll()](https://www.runoob.com/java/java-arraylist-addall.html) | 添加集合中的所有元素到 arraylist 中           |
| [clear()](https://www.runoob.com/java/java-arraylist-clear.html) | 删除 arraylist 中的所有元素                   |
| [clone()](https://www.runoob.com/java/java-arraylist-clone.html) | 复制一份 arraylist                            |
| [contains()](https://www.runoob.com/java/java-arraylist-contains.html) | 判断元素是否在 arraylist                      |
| [get()](https://www.runoob.com/java/java-arraylist-get.html) | 通过索引值获取 arraylist 中的元素             |
| [indexOf()](https://www.runoob.com/java/java-arraylist-indexof.html) | 返回 arraylist 中元素的索引值                 |
| [removeAll()](https://www.runoob.com/java/java-arraylist-removeall.html) | 删除存在于指定集合中的 arraylist 里的所有元素 |
| [remove()](https://www.runoob.com/java/java-arraylist-remove.html) | 删除 arraylist 里的单个元素                   |
| [size()](https://www.runoob.com/java/java-arraylist-size.html) | 返回 arraylist 里元素数量                     |
| [isEmpty()](https://www.runoob.com/java/java-arraylist-isempty.html) | 判断 arraylist 是否为空                       |
| [subList()](https://www.runoob.com/java/java-arraylist-sublist.html) | 截取部分 arraylist 的元素                     |
| [set()](https://www.runoob.com/java/java-arraylist-set.html) | 替换 arraylist 中指定索引的元素               |
| [sort()](https://www.runoob.com/java/java-arraylist-sort.html) | 对 arraylist 元素进行排序                     |
| [toArray()](https://www.runoob.com/java/java-arraylist-toarray.html) | 将 arraylist 转换为数组                       |
| [toString()](https://www.runoob.com/java/java-arraylist-tostring.html) | 将 arraylist 转换为字符串                     |
| [ensureCapacity](https://www.runoob.com/java/java-arraylist-surecapacity.html)() | 设置指定容量大小的 arraylist                  |
| [lastIndexOf()](https://www.runoob.com/java/java-arraylist-lastindexof.html) | 返回指定元素在 arraylist 中最后一次出现的位置 |
| [retainAll()](https://www.runoob.com/java/java-arraylist-retainall.html) | 保留 arraylist 中在指定集合中也存在的那些元素 |
| [containsAll()](https://www.runoob.com/java/java-arraylist-containsall.html) | 查看 arraylist 是否包含指定集合中的所有元素   |
| [trimToSize()](https://www.runoob.com/java/java-arraylist-trimtosize.html) | 将 arraylist 中的容量调整为数组中的元素个数   |
| [removeRange()](https://www.runoob.com/java/java-arraylist-removerange.html) | 删除 arraylist 中指定索引之间存在的元素       |
| [replaceAll()](https://www.runoob.com/java/java-arraylist-replaceall.html) | 将给定的操作内容替换掉数组中每一个元素        |
| [removeIf()](https://www.runoob.com/java/java-arraylist-removeif.html) | 删除所有满足特定条件的 arraylist 元素         |
| [forEach()](https://www.runoob.com/java/java-arraylist-foreach.html) | 遍历 arraylist 中每一个元素并执行特定操作     |

更多 API 方法可以查看：https://www.runoob.com/manual/jdk11api/java.base/java/util/ArrayList.html

## HashMap

map 是一种键值对的数据结构。HashMap是Map实现类中最常用的一个。HashMap 是无序的，即不会记录插入的顺序。

```java
import java.util.HashMap; // 引入 HashMap 类

// 创建一个hashMap
HashMap<String, String> Sites = new HashMap<String, String>();
Sites.put("Google", "谷歌");  // 添加元素
Sites.put("baidu", "百度");
```

如上面代码将创建一个类似如下表格的数据

| key    | value |
| ------ | ----- |
| Googel | 谷歌  |
| baidu  | 百度  |

表格中的key 和value 的值是一一对应的关系，当使用```Sites.get("Googel")```时会返回 “谷歌” 字符串。

代码示例

```java
import java.util.HashMap;
public class Test2 {

    public static void main(String[] args) {
        HashMap<String, String> Sites = new HashMap<String, String>();
        Sites.put("Google", "谷歌");
        Sites.put("baidu", "百度");

        System.out.println(Sites.get("Google"));
        System.out.println(Sites.get("baidu"));
    }
}
```

HashMap中常用方法:

* **put()** 添加元素
* **get()** 访问元素
* **remove()**  删除元素
* **size()** 计算大小
* **containsKey()** 判断key是否存在

代码示例

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        HashMap<String, String> Sites = new HashMap<String, String>();
        Sites.put("Google", "谷歌");
        Sites.put("baidu", "百度");

        System.out.println(Sites.get("Google"));
        System.out.println(Sites.get("baidu"));

        HashMap<String, String> sites = new HashMap<>();
        sites.put("谷歌", "www.google.com");
        sites.put("百度", "www.baidu.com");
        sites.put("菜鸟", "www.runoob.com");
        sites.put("淘宝", "www.taobao.com");
        System.out.println("sites中的值: " + sites.toString());

        // 获取元素
        System.out.println("获取key为'菜鸟'的值: " + sites.get("菜鸟"));

        // 删除元素
        sites.remove("菜鸟");
        System.out.println("删除key为'菜鸟'的键值对: " + sites);

        // 计算大小
        System.out.println("site的大小为: " + sites.size());

        // 判断key 是否存在
        System.out.println("判断key为'菜鸟'的元素是否存在: " + sites.containsKey("菜鸟"));

        // 遍历map
        // 向HashMap中添加的元素并不能保证有序性
        System.out.println("---------------------");
        System.out.println("使用entrySet 遍历map");
        Set<Map.Entry<String, String>> entries = sites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print("(key: " + entry.getKey());
            System.out.print(", value: " + entry.getValue() + ")\n");
        }
        System.out.println("---------------------");
        System.out.println("使用keySet 获取所有的key 再使用key 遍历map");
        Set<String> strings = sites.keySet();
        for (String s: strings){
            System.out.println("(key: " + s + ", value: " + sites.get(s) + ")");
        }

    }
}

```

HashMap 常用方法：

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [clear()](https://www.runoob.com/java/java-hashmap-clear.html) | 删除 hashMap 中的所有键/值对                                 |
| [clone()](https://www.runoob.com/java/java-hashmap-clone.html) | 复制一份 hashMap                                             |
| [isEmpty()](https://www.runoob.com/java/java-hashmap-isempty.html) | 判断 hashMap 是否为空                                        |
| [size()](https://www.runoob.com/java/java-hashmap-size.html) | 计算 hashMap 中键/值对的数量                                 |
| [put()](https://www.runoob.com/java/java-hashmap-put.html)   | 将键/值对添加到 hashMap 中                                   |
| [putAll()](https://www.runoob.com/java/java-hashmap-putall.html) | 将所有键/值对添加到 hashMap 中                               |
| [putIfAbsent()](https://www.runoob.com/java/java-hashmap-putifabsent.html) | 如果 hashMap 中不存在指定的键，则将指定的键/值对插入到 hashMap 中。 |
| [remove()](https://www.runoob.com/java/java-hashmap-remove.html) | 删除 hashMap 中指定键 key 的映射关系                         |
| [containsKey()](https://www.runoob.com/java/java-hashmap-containskey.html) | 检查 hashMap 中是否存在指定的 key 对应的映射关系。           |
| [containsValue()](https://www.runoob.com/java/java-hashmap-containsvalue.html) | 检查 hashMap 中是否存在指定的 value 对应的映射关系。         |
| [replace()](https://www.runoob.com/java/java-hashmap-replace.html) | 替换 hashMap 中是指定的 key 对应的 value。                   |
| [replaceAll()](https://www.runoob.com/java/java-hashmap-replaceall.html) | 将 hashMap 中的所有映射关系替换成给定的函数所执行的结果。    |
| [get()](https://www.runoob.com/java/java-hashmap-get.html)   | 获取指定 key 对应对 value                                    |
| [getOrDefault()](https://www.runoob.com/java/java-hashmap-getordefault.html) | 获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值 |
| [forEach()](https://www.runoob.com/java/java-hashmap-foreach.html) | 对 hashMap 中的每个映射执行指定的操作。                      |
| [entrySet()](https://www.runoob.com/java/java-hashmap-entryset.html) | 返回 hashMap 中所有映射项的集合集合视图。                    |
| [keySet](https://www.runoob.com/java/java-hashmap-keyset.html)() | 返回 hashMap 中所有 key 组成的集合视图。                     |
| [values()](https://www.runoob.com/java/java-hashmap-values.html) | 返回 hashMap 中存在的所有 value 值。                         |
| [merge()](https://www.runoob.com/java/java-hashmap-merge.html) | 添加键值对到 hashMap 中                                      |
| [compute()](https://www.runoob.com/java/java-hashmap-compute.html) | 对 hashMap 中指定 key 的值进行重新计算                       |
| [computeIfAbsent()](https://www.runoob.com/java/java-hashmap-computeifabsent.html) | 对 hashMap 中指定 key 的值进行重新计算，如果不存在这个 key，则添加到 hasMap 中 |
| [computeIfPresent()](https://www.runoob.com/java/java-hashmap-computeifpresent.html) | 对 hashMap 中指定 key 的值进行重新计算，前提是该 key 存在于 hashMap 中。 |

更多 API 方法可以查看：https://www.runoob.com/manual/jdk11api/java.base/java/util/HashMap.html

## HashSet

Set 是一个集合，其中的元素是不重复的，也就是说每个值在一个Set中最多只能出现一次。HashSet是Set 接口的一个实现类，HashSet 不会记录出入的顺序，也就是无序的。

HashSet中常用方法

* **add()** 添加一个元素，如果是已有元素则不会添加
* **contains()** 判断元素是否存在于集合中
* **remove()** 删除集合中的元素
* **size()** 计算集合的大小
* **clear()** 删除集合中所有的元素

代码示例

```java
import java.util.HashSet;

public class Test3 {

    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        // 添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        System.out.println(sites);

        // 判断元素是否存在集合中
        System.out.println("判断'Google'是否存在集合当中: " + sites.contains("Google"));

        // 删除集合中的元素
        sites.remove("Google");
        System.out.println("删除'Google'元素: " + sites);

        // 计算集合中的大小
        System.out.println("计算集合的大小: " + sites.size());

        // 删除集合中所有的元素
        sites.clear();
        System.out.println("删除集合所有的元素: " + sites);
      
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 遍历集合
        System.out.println("----------------------");
        System.out.println("使用增强for循环");
        for (String s: sites){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("使用迭代器迭代");
        Iterator<String> iter = sites.iterator();
        while (iter.hasNext()){
            String s = iter.next();
            System.out.print(s + " ");
        }
    }
}

```

