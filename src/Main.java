class BinaryTree{
    Node root;

    public void addNode(int value){
        Node newNode = new Node(value);

        if(root==null){
            root=newNode;
        }
        else{
            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;
                if(value < focusNode.value){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.rightChild;{
                        if(focusNode == null){
                            parent.rightChild=newNode;
                            return;
                        }
                    }
                }

            }
        }
    }

    public void inOrderTraversal (Node focusNode){
        if(focusNode!=null){
            inOrderTraversal((focusNode.leftChild));
            System.out.println(focusNode.getValue());
            inOrderTraversal(focusNode.rightChild);
        }
    }

    public void preOrderTraversal (Node focusNode){
        if(focusNode!=null){
            System.out.println(focusNode.getValue());
            preOrderTraversal((focusNode.leftChild));
            preOrderTraversal(focusNode.rightChild);
        }
    }

    public void postOrderTraversal (Node focusNode){
        if(focusNode!=null){
            postOrderTraversal((focusNode.leftChild));
            postOrderTraversal(focusNode.rightChild);
            System.out.println(focusNode.getValue());
        }
    }

    public Node findNode(int value){
        Node focusNode = root;

        while(focusNode.value != value){
            if(value<focusNode.value)
                focusNode=focusNode.leftChild;
            else
                focusNode=focusNode.rightChild;
            if (focusNode==null)
                return null;
        }
        return focusNode;
    }
}

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(6);
        tree.addNode(8);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(12);
        tree.addNode(5);
        tree.preOrderTraversal(tree.root);
    }
}

class Node{
    int value;

    Node leftChild;
    Node rightChild;

    Node (int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
