public class Main {

    public static void main(String[] args) {
	    Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.nextNode = two;
        two.nextNode = three;
        three.nextNode = four;
        four.nextNode = five;
    }
}