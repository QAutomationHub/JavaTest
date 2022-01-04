package input_output_tools.decorator_demo;

public abstract class BaseDecorator implements ITree {

    protected ITree tree;

    public BaseDecorator(ITree tree) {
        this.tree = tree;
    }

    @Override
    public String getTree() {
        return tree.getTree();
    }
}
