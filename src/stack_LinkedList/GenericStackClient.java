package stack_LinkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("Stack of String");
        StackOfString();
        System.out.println("Stack of Integer");
        StackOfInteger();
    }
private static void StackOfString(){
    MyGenericStack<String> stack = new MyGenericStack<>();
    stack.push("five");
    stack.push("four");
    stack.push("three");
    stack.push("two");
    stack.push("one");
    System.out.println("Stack of size after push : " + stack.size());
    System.out.println("pop element stack");
    while (!stack.isEmpty()){
        System.out.println(stack.pop());
    }
    System.out.println("Stack of size after pop : " + stack.size());
}
private static void StackOfInteger(){
    MyGenericStack<Integer> stack = new MyGenericStack<>();
    stack.push(5);
    stack.push(4);
    stack.push(3);
    stack.push(2);
    stack.push(1);
    System.out.println("2.1. Size of stack after push operations: " + stack.size());
    System.out.printf("2.2. Pop elements from stack : ");
    while (!stack.isEmpty()) {
        System.out.printf(" %d", stack.pop());
    }
    System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());

}
}
