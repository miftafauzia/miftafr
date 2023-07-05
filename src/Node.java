public class Node<E>{
    private E data = null;
    private ArrayList<Node<E>> children = new ArrayList<Node<E>>();
    private Node<E> parent = null;
    private int level = 0;

    public Node(E data) {
        this.data = data;
    }

    public Node() {
    }

    public void addChild(Node<E> child) {
        child.setParent(this);
        this.children.add(child);
    }
    
    public void addChild(E data) {
        Node<E> newChild = new Node<>(data);
        this.addChild(newChild);
    }
    
    private void setParent(Node<E> parent) {
        this.parent = parent;
        this.level = parent.getLevel() + 1;
    }

    public ArrayList<Node<E>> getChildren() {
        return children;
    }
    
    public int getNumChild() {
        return this.children.size();
    }
    
    public int getLevel(){
        return this.level;
    }

    public Object getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }
}

