public class Main {
    public static void main(String[] args) {

        DishStack dishStack = new DishStack(3);

        // Push dishes onto the stack
        dishStack.push(new Dish("Plate"));
        dishStack.push(new Dish("Bowl"));
        dishStack.push(new Dish("Saucer"));

        // Try to push onto a full stack
        dishStack.push(new Dish("Mug"));

        System.out.println("Stack size: " + dishStack.size()); // 3

        // Peek at the top
        dishStack.peek();

        // Pop all dishes
        dishStack.pop();
        dishStack.pop();
        dishStack.pop();

        // Try to pop from empty stack
        dishStack.pop();

        System.out.println("Stack size: " + dishStack.size()); // 0
    }
}