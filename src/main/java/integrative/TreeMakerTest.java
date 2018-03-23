package integrative;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 潘峰
 * @date 23/03/2018 11:05 AM
 */
public class TreeMakerTest {

    public static void main(String[] args) {

        // 两个根节点
        List<DemoTreeNode> nodes = Arrays.asList(
                new DemoTreeNode("1", null),
                new DemoTreeNode("2", "1"),
                new DemoTreeNode("3", "2"),
                new DemoTreeNode("4", "2"),
                new DemoTreeNode("5", "3"),
                new DemoTreeNode("6", "5"),
                new DemoTreeNode("7", "5"),
                new DemoTreeNode("8", null)
        );

        List<DemoTreeNode> roots = TreeMaker.makeTree(
                nodes,
                DemoTreeNode::getId, DemoTreeNode::getParent,
                (parent, child) -> {
                    parent.getChildren().add(child);
                    child.setParent(parent.getId());
                });

        roots.forEach(System.out::println);
    }


    public static class DemoTreeNode {

        private String id;

        private String parent;

        private List<DemoTreeNode> children = new ArrayList<>();

        public DemoTreeNode(String id, String parent) {
            this.id = id;
            this.parent = parent;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public List<DemoTreeNode> getChildren() {
            return children;
        }

        public void setChildren(List<DemoTreeNode> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            return "DemoTreeNode{" +
                    "id='" + id + '\'' +
                    ", parent='" + parent + '\'' +
                    ", children=" + children +
                    '}';
        }
    }
}