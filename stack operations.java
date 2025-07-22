import java.util.Scanner;

class Stack {
    char[] arr = new char[5];
    int top = -1;

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operation: 1.Push 2.Pop 3.Display 4.Exit");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter character to push:");
                    char ele = sc.next().charAt(0);
                    if (stack.top < 4) { // Array index 0 to 4 (5 elements)
                        stack.top++;
                        stack.arr[stack.top] = ele;
                    } else {
                        System.out.println("Stack Overflow");
                    }
                    break;

                case 2:
                    if (stack.top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        char poppedEle = stack.arr[stack.top];
                        stack.top--;
                        System.out.println("Element popped: " + poppedEle);
                    }
                    break;

                case 3:
                    if (stack.top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Elements in the stack are:");
                        for (int i = stack.top; i >= 0; i--) {
                            System.out.print(stack.arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }
    }
}
