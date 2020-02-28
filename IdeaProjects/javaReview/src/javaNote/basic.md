java基础笔记
===

## 1.idea中快速生成代码的方法
例如： `5.fori`会生成如下代码：

``` 
for(int i = 0; i < 5; i++) {

}

```
例如：  '5.forr'会生成如下代码:

~~~
for(int i = 5; i > 0; i--) {

}
~~~

例如： 由一个数组名称为arr  `arr.fori`会生成如下代码,  
同样还有 数组名.forr 和数组名.for   
~~~
for(int i = 0; i < arr.length; i++){
}
~~~



在需要更改的代码处按：Shift + F6 ： 那么所有用到此名称的地方都会改变
如：
```
    public static boolean isSame(short i, short j) {
        return i == j;
        }
```
将其中的一个i变成a，则代码会变成：
```
   public static boolean isSame(short a, short j) {
        return a == j;
        }

```

## 2.相关知识点笔记
方法的重载：对于同一个类中的方法，如果多个方法的名称一样，
          但是参数列表内参数的个数不同
          或者参数个数相同，但是参数类型不完全相同，
          或者参数的多类型顺序不同
          那么这些方法就属于重载(overload)

与下列因素无关： 与参数的名称无关，与方法的返回值类型无关      

***
public static void open(int a, double b) {
}    
static void open(int i, double j) {
}  
同一个类中的这两个方法会产生冲突
___

数组的特点：

1. 数组是一种引用数据类型
2. 数组当中的多个数据，类型必须统一
3. 数组的长度在程序运行期间不可改变

如果不确定数组中的具体内容，用动态初始化，否则，用静态初始化
创建数组的两种方式：  
动态初始化数组(指定长度)：  
```int[] arr0 = new int[3]```  
```String[] arr1 = new String[5];```

   
静态初始化数组(指定内容)：   
标准格式：  
```String[] arr2 = new String[]{"a", "dfjkf", "dfdhdjdj"};```  
省略格式：  
```String[] arr2 = {"a", "dfjkf", "dfdhdjdj"}```  
  
标准格式：
```int[] arr3 = new int[1, 2, 5]```  
省略格式：
```int[] arr3 = {1, 2, 5}```  

[I@75412c2f代表的意义：   
[: 代表这是数组类型  
I： 代表里边全是int类型
75412c2f：16进制

```
        byte[] arr0 = new byte[3];
        System.out.println(arr0);
        int[] arr1 = {1, 3, 4};
        System.out.println(arr1);
        Object[] arr2 = new Object[5];
        System.out.println(arr2);
        String[] arr3 = new String[4];
        System.out.println(arr3);
运行结果：
[B@75b84c92
[I@6bc7c054
[Ljava.lang.Object;@232204a1
[Ljava.lang.String;@4aa298b7
```

对于数组：使用动态初始化数组的时候，其中的元素将会有一个默认值，规则如下：  
整数类型：默认值为0  
浮点类型：默认值为0.0
字符类型：默认值为'\u0000'
布尔类型：默认值为false
引用类型：默认值为null

## java中内存的分布：
java的内存需要分为5个部分:  
1.栈(Stack): 存放的是方法中的局部变量，方法的运行一定要在栈当中        
局部变量：方法的参数,或者是方法内部的变量  
作用域：一旦超出作用域，立刻从栈内存中消失 
       
2.堆内存(Heap)：凡是new出来的东西，都在堆当中  
堆内存里面的东西都有一个地址值：16进制
  
堆内存里面的数据都有一个默认值，规则如下：
整数类型：默认值为0  
浮点类型：默认值为0.0  
字符类型：默认值为'\u0000'  
布尔类型：默认值为false  
引用类型：默认值为null  

3.方法区(Method Area)：存储.class相关信息，包含方法的信息  
4.本地方法栈(Native Method Stack):与操作系统相关    
5.寄存器(PC Register)：与CPU有关  

## 面向对象三大特征：  
封装：就是将一些细节信息隐藏起来，对外界不可见
* 1.方法就是一种封装  
* 2.关键字public, private, protected也是一种封装  
* 注意：对于基本类型当中的boolean值，getter方法一定要写成isXXX的方法，而setter方法不变  
继承：  
多态：  

### 字符串
* equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样  
* 如果待比较的双方一个是常量一个是变量，推荐把常量写在前面 如：推荐写` “Hello”.equals(str)` 却不推荐写 `str.equals("Hello") `因为当str为null时，后一种写法会报错  
`public String concat(String str)`: 将当前字符串和参数字符串拼接成为放回值新的字符串  
`public int indexOf(string str)`: 查找当前字符串在本字符串中首次出现的索引位置，如果没有则返回-1  
`public String subString(int index)`:截取索引值begin以后的所有字符
`public String substring(int begin, int end)`: 截取索引值从begin到end的子字符串，同样左闭右开  
`public char[] toCharArray()`: 将当前字符串拆分成字符数组作为返回值  
`public byte[] getBytes()`:获得当前字符串底层的字节数组
`public String replace(CharSequence oldString, CharSequence newString)`: 将所有出现的老字符串替换成新的字符串
`public String[] split(String regex)`:按照参数的规则，将字符串切分成若干部分  
但是注意：split方法的参数实际是一个正则表达式，如果要按照英文"."进行分割，必须写"\\."， 
