package creative.prototype;

import java.io.*;

/**
 * 原型模式
 *
 * 用于创建重复的对象，同时又能保证性
 *
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 * 例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用
 *
 * @author Fang Qing
 * @date 2019/5/29 9:12
 */
public class Prototype implements Cloneable,Serializable  {
    private static final long serialVersionUID = 1L;
    private String string;
    private SerializableObject obj;

    /**
     * super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的
     *
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
     *
     * 浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone ();
        return proto;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream ();
        ObjectOutputStream oos = new ObjectOutputStream (bos);
        oos.writeObject (this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream (bos.toByteArray ());
        ObjectInputStream ois = new ObjectInputStream (bis);
        return ois.readObject ();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    private class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }
}
