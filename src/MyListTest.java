import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList <Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("Element 1 = " + listInteger.get(1));
        System.out.println("Element 3 = " + listInteger.get(3));
        System.out.println("Element 4 = " + listInteger.get(4));

        listInteger.get(5);
        System.out.println("Element 5 = " + listInteger.get(5));
    }
}
