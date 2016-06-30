/**
 * Created by lbw on 2015/3/9.
 * 栈、队列
 */
public class StackQueueDemo {

    public static void main(String[] args){
        queueToStack();

    }

    private static void queueToStack(){
        Stack stack=new Stack();
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        stack.pop();
        stack.pop();
        stack.pop();

        for(int j=9;j<16;j++){
            stack.push(j);
        }

        Integer num;
        while((num=stack.pop())!=null)
            System.out.print(num);
    }

    private static void stackToQueue(){
        Queue queue=new Queue();
        for(int i=0;i<5;i++){
            queue.push(i);
        }
        queue.pop();
        queue.pop();
        queue.pop();

        for(int j=9;j<16;j++){
            queue.push(j);
        }

        Integer num;
        while((num=queue.pop())!=null)
            System.out.print(num);
    }

}
