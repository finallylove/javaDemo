/**
 * Created by lbw on 2015/3/9.
 * 树
 */

public class TreeDemo {

    static Integer[] arr={1,2,3,4,5,6,7};

    public static void main(String[] args){
        Tree<Integer> tree=new Tree<>();
        Tree.Node node=tree.createTree(arr,0);
        System.out.println(node.getValue());
        tree.preOrder(node);
        System.out.print("num="+tree.num);
    }
}
