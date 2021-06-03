## 1、工厂模式

实际上工厂模式存在三种实现形式，分别是 简单工厂模式、工厂方法模式、抽象工厂模式

### 1.1、简单工厂模式

> 相对来说简单工厂模式整体复杂程度不高，主要负责的是实现和创建所有实例的内部逻辑，工厂类的创建产品的方法可以直接被外界所调用，创建所需的产品对象

### 1.2、抽象工厂模式(abstract-factory-pattern)

> 提供一个创建一系列相关或者相互依赖对象的接口，不需要指定他们具体的类。也就是说客户端不需要指定产品的具体类型，创建多个产品族中的产品对象

### 1.3、工厂方法模式(factory-method-pattern)

> 工厂方法模式有叫做多态性工厂模式，指定义一个创建对象的接口，但由实现这个接口的类来决定实例化哪个类，工厂方法把类的实现推迟到了子类

在工厂方法模式中，不再由单一工厂类生产产品，而是由工厂的子类实现具体产品的创建。它主要解决的是switch过多的情况

#### 1.3.1、定义抽象工厂和产品

```java
// 抽象产品
public interface IProduct {
    void doSomething();
}
// 抽象工厂
public interface IFactory {
    IProduct makeProduct();
}
// 定义对应三款产品
// 定义三款产品对应的工厂
```

#### 1.3.2、优点和缺点

- 优点

> 1、灵活性增强了，对于产生新产品只需要多写一个相应的工厂类。
>
> 2、耦合度降低了，上层调用只需要知道产品是抽象类，不需要关心其他实现类。

- 缺点

> 1、增加了类的个数，增加了复杂度
>
> 2、增加了系统的抽象性和理解难度
>
> 3、抽象产品只能生产单一产品，此弊端可以采用抽象工厂模式来解决

## 2、单例模式(singleton-service)

> 单例模式指确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点。

### 2.1、应用场景

> 1、需要频繁创建的一些类，使用单例可以降低系统内存的压力，减少GC次数
>
> 2、某些类创建实例时占用资源较多，或者实例化时间较长，而且经常使用
>
> 3、频繁访问数据库或者文件的对象。
>
> 4、对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统就会乱套

### 2.2、常用写法

- 饿汉式

```java
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton = new HungryStaticSingleton();

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
```

- 懒汉式

```java
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazy == null) {
                    lazy = new LazySimpleSingleton();
                }
            }
        }
        return lazy;
    }
}
```

- 内部类

```java
public class Client {
    public static void main(String[] args) {
        Singleton.getInstance();
    }

    static class Singleton {
        private static final Singleton instance = new Singleton();

        private Singleton() {
        }

        public static Singleton getInstance() {
            return instance;
        }
    }
}
```

- 枚举

```java
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
```

### 2.3、优缺点

- 优点

> 1、可以保证内存只有一个实例，减少内存的开销
>
> 2、可以避免对资源的多重占用
>
> 3、单例模式设置全局访问点，可以优化和共享资源的访问

- 缺点

> 1、单例模式一般没有接口，扩展困难。如果要扩展，则除了修改原来的代码没有第二种途径，违背开闭原则
>
> 2、并发测试中，单例模式不利于代码调试。在调试过程中如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
>
> 3、单例模式的功能代码通常写在一个类中，如果功能设计不合理，很容易违背单一职责原则

## 3、原型模式(prototype-service)

> 指原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象，java本身的clone方法实际上属于浅克隆。

### 3.1、优缺点

- 优点

> 1、java自带的原型模式基于内存二进制流的复制，在性能上比new一个对象更加优良。
>
> 2、可以使用深克隆方式保存对象状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用，例如状态还原，可以辅助实现撤销操作。

- 缺点

> 1、需要为每一个类都配置一个clone方法
>
> 2、clone方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则
>
> 3、当实现深克隆时，需要编写较为复杂的代码，而且当对象存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此深克隆和浅克隆需要考虑场景

## 4、代理模式(proxy-pattern)

> 指为其他对象提供一种代理，以控制这个对象的访问

## 5、门面模式(facade-pattern)

> 又叫做外观模式，提供了一个统一的接口用来访问子系统中的一群接口，其主要特征是定义了一个高层接口让子系统更容易使用。

## 6、装饰器模式(decorator-pattern)

> 又叫做包装器模式，指在不改变原有对象的基础上动态的给一个对象添加一些额外的指责，就增加功能来说装饰器模式相比生成子类更为灵活。

## 7、享元模式



## 8、组合模式(composite-pattern)



## 9、适配器模式(adapter-pattern)



## 10、桥接模式(bridge-pattern)



## 11、委派模式(delegate-pattern)



## 12、模板方法模式(template-pattern)



## 13、策略模式(strategy-service)



## 14、责任链模式(chain-responsibility-pattern)



## 15、迭代器模式(iterator-pattern)



## 16、命令模式(command-pattern)



## 17、状态机模式(state-machine-pattern)



## 18、备忘录模式(memento-pattern)



## 19、中介者模式(mediator-pattern)



## 20、解释器模式(interpreter-pattern)



## 21、观察者模式(observer-pattern)



## 22、访问者模式(visitor-pattern)

