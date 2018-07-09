import java.util.ArrayList;
import java.util.List;

public class Node {

    private String value;
    private final Node parent;
    private final List<Node> children = new ArrayList<>();


    public Node(Node parent) {
        this.parent = parent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public Node getParent() {
        return parent;
    }

    public List<Node> getChildren() {
        return children;
    }

}

