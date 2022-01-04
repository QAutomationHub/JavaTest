package input_output_tools.decorator_demo;

public class NewYearTreeDecorator extends BaseDecorator {

    public NewYearTreeDecorator(ITree tree) {
        super(tree);
    }

    @Override
    public String getTree() {
        return super.getTree() + " новогоднее";
    }
}
