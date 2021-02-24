package tech.vorbote.list;

@SuppressWarnings("unchecked")
public class LinearList<E> implements IList<E> {
    private E[] data;
    private int length;

    public LinearList() {
        this.data = (E[]) new Object[10];
        this.length = 0;
    }

    public LinearList(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.length = 0;
    }

    /**
     * 判断该表的数据数组是否被填满
     * @return 被填满则返回true，否则返回false
     */
    private boolean isFilled() {
        if (this.IsEmpty())
            // 如果列表是空，则直接返回false
            return false;
        for (Object e : this.data) {
            if (e == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * 扩容
     */
    private void expand() {
        E[] oldList = this.data;
        E[] newList = (E[]) new Object[this.length + 5];
        System.arraycopy(oldList, 0, newList, 0, oldList.length);
        this.data = newList;
    }

    @Override
    public int Len() {
        return this.length;
    }

    @Override
    public void Clear() {
        this.length = 0;
        this.data = (E[]) new Object[10];
    }

    @Override
    public boolean IsEmpty() {
        return this.length == 0;
    }

    @Override
    public boolean IsNotEmpty() {
        return !this.IsEmpty();
    }

    @Override
    public boolean Append(E e) {
        if (this.length >= MAX_SIZE)
            return false;
        if (this.isFilled()) {
            // 被填满，则扩容后再填充
            this.expand();
        }
        this.data[this.length] = e;
        ++this.length;
        return false;
    }

    @Override
    public boolean Insert(int index, E e) {
        if (index > this.length) {
            System.err.println("索引大小超过当前表长度，无法插入...");
            // 如果用户提供的索引在当前长度之后，则提示错误
            return false;
        }
        if (this.length >= MAX_SIZE) {
            System.err.println("为防止内存占用过大，禁止再向此表插入新的数据");
            // 如果超过最大数量限制，则禁止扩充
            return false;
        }
        if (this.isFilled()) {
            // 被填满，则扩容后再填充
            this.expand();
        }
        // 将所有的index之后的元素往后移动
        if (this.length - index >= 0)
            System.arraycopy(data, index, data, index + 1, this.length - index);
        this.data[index] = e;
        ++this.length;

        return false;
    }

    @Override
    public E Delete(int index) {
        if (index > this.length || index < 0) {
            System.err.println("数据不存在，无法删除！");
            return null;
        }
        E val = this.Get(index);
        if (this.data.length - 1 - index >= 0)
            System.arraycopy(this.data, index + 1, this.data, index, this.data.length - 1 - index);
        --this.length;
        return val;
    }

    @Override
    public E Get(int index) {
        return this.data[index];
    }

    @Override
    public int Find(E e) {
        for (int i = 0; i < this.length; ++i) {
            if (this.Get(i) == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int FindLast(E e) {
        for (int i = this.length - 1; i >= 0; --i) {
            if (this.Get(i) == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void Display() {
        for (Object e : this.data) {
            if (e == null)
                continue;
            System.out.println(e);
        }
    }
}
