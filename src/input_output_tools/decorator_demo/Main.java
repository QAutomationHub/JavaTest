package input_output_tools.decorator_demo;

public class Main {

    public static void main(String[] args) {

        ITree myTree = new Tree();

        System.out.println(myTree.getTree()); // Это дерево
        System.out.println(new WithStarDecorator(myTree).getTree()); // Это дерево со звездой
        System.out.println(new WithStarDecorator(new NewYearTreeDecorator(myTree)).getTree()); // Это дерево новогоднее со звездой
    }
}
