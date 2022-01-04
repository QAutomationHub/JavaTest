package input_output_tools.decorator_demo;

public class WithStarDecorator extends BaseDecorator {

    public WithStarDecorator(ITree tree) {
        super(tree);
    }

    @Override
    public String getTree() {
        return super.getTree() + " со звездой";
    }
}
