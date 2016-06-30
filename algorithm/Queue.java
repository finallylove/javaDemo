import java.util.Stack;

/**
 * Created by lbw on 2015/3/9.
 */
public class Queue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public Integer push(Integer integer) {
        return stack1.push(integer);
    }

    public Integer pop() {
        if (stack2.size() <= 0) {
            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.size() == 0)
            return null;

        return stack2.pop();
    }
}

