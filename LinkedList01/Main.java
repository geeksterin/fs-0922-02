public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        for(int i = 0; i < 10; i ++) list.addFirst(i);
        list.addAt(100, 3);
        System.out.println(list);
    }
}