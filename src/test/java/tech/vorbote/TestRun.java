package tech.vorbote;

import org.junit.Test;
import tech.vorbote.list.LinearList;

import java.util.ArrayList;

public class TestRun {

    @Test
    public void run01() {
        LinearList<Integer> list = new LinearList<>();
        System.out.println("Initializing a new LinearList...");
        System.out.println("Length of this list: [" + list.Len() + "].");
        list.Append(20);
        list.Append(100);

        System.out.println("---------------------");
        System.out.println("Length of this list: [" + list.Len() + "].");

        list.Display();

        System.out.println("---------------------");
        list.Insert(2, 30);
        System.out.println("Length of this list: [" + list.Len() + "].");
        list.Display();

        System.out.println("---------------------");
        list.Delete(2);
        System.out.println("Length of this list: [" + list.Len() + "].");
        list.Display();
    }
}
