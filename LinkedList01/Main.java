public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        for(int i = 0; i < 10; i ++) list.addFirst(i);
        System.out.println(list);
    }
}