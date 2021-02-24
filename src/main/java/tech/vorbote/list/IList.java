package tech.vorbote.list;

import java.util.function.Consumer;

public interface IList<E> {

    public final int MAX_SIZE = 100;

    /**
     * 获取当前表的长度
     * @return 表的长度
     */
    int Len();

    /**
     * 清空表中的数据
     */
    void Clear();

    /**
     * 判断该表是否为空
     * @return 为空返回true，否则返回false
     */
    boolean IsEmpty();

    /**
     * 判断该表是否为非空
     * @return 为非空返回true，否则返回false
     */
    boolean IsNotEmpty();

    /**
     * 在表的最后插入一个元素
     * @param e 将被附加的元素
     * @return 成功返回true，否则返回false
     */
    boolean Append(E e);

    /**
     * 在表的指定位置插入一个元素
     * @param e 将被附加的元素
     * @return 成功返回true，否则返回false
     */
    boolean Insert(int index, E e);

    /**
     * 将指定索引位置的元素删除
     * @param index 指定索引
     * @return 删除后将被删除的元素返回
     */
    E Delete(int index);

    /**
     * 提取出指定索引位置的元素
     * @param index 索引
     * @return 成功返回索引位上的元素，否则返回null
     */
    E Get(int index);

    /**
     * 根据指定元素查找该元素在表中首次出现的位置
     * @param e 元素
     * @return 成功返回定位，否则返回-1
     */
    int Find(E e);

    /**
     * 根据指定元素查找该元素在表中最后一次出现的位置
     * @param e 元素
     * @return 成功返回定位，否则返回-1
     */
    int FindLast(E e);

    /**
     * 遍历打印
     */
    void Display();
}
