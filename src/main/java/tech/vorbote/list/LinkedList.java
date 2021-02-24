package tech.vorbote.list;

public class LinkedList<E> implements IList<E> {
    private LinkedList<E> pre;
    private E data;
    private LinkedList<E> next;
    
    @Override
    public int Len() {
        return 0;
    }

    @Override
    public void Clear() {

    }

    @Override
    public boolean IsEmpty() {
        return false;
    }

    @Override
    public boolean IsNotEmpty() {
        return false;
    }

    @Override
    public boolean Append(E e) {
        return false;
    }

    @Override
    public boolean Insert(int index, E e) {
        return false;
    }

    @Override
    public E Delete(int index) {
        return null;
    }

    @Override
    public E Get(int index) {
        return null;
    }

    @Override
    public int Find(E e) {
        return 0;
    }

    @Override
    public int FindLast(E e) {
        return 0;
    }

    @Override
    public void Display() {

    }
}
