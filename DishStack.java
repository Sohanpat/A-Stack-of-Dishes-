public class DishStack {

    private Dish[] stack;
    private int top;
    private int maxSize;

    public DishStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Dish[maxSize];
        this.top = -1; // -1 indicates the stack is empty
    }

    // Push a Dish onto the stack
    public void push(Dish dish) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full! Cannot push: " + dish.description);
            return;
        }
        stack[++top] = dish;
        System.out.println("Pushed: " + dish.description);
    }

    // Pop a Dish off the stack
    public Dish pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to pop.");
            return null;
        }
        Dish removed = stack[top];
        stack[top--] = null; // Remove reference and decrement top
        System.out.println("Popped: " + removed.description);
        return removed;
    }

    // Peek at the top Dish without removing it
    public Dish peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek at.");
            return null;
        }
        System.out.println("Top of stack: " + stack[top].description);
        return stack[top];
    }

    // Return the current number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Helper: check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}