public class Main {
    private static void preOrderCariBawahan(Node<String> node, int depth){
   // fungsi rekursi untuk penelusuran dengan Pre Order
    for(int i=0;i<depth;i++){
        System.out.print("--");
    }
    System.out.println(" " + node.getData());
    
    for(int i=0;i<node.getNumChild();i++){
        Node<String> child = (Node<String>) node.getChildren().get(i);
        preOrderCariBawahan(child, depth+1);
    }
}
    public static void CariBawahan(String nama, Tree<String> Pegawai){
        Node<String> Awal = Pegawai.getNode(nama);
        preOrderCariBawahan(Awal, 0);
}

    public static void main(String[] args) {

        Tree<String> Pegawai = new Tree<String>("Jimi");
        
        Pegawai.addChild("Jimi", "Roy");
        Pegawai.addChild("Jimi", "Mal");
        Pegawai.addChild("Jimi", "Ali");
        
        Node<String> childNode1 = new Node<String>("Adi");
        Node<String> childNode2 = new Node <String>("Ica"); 
        Node<String> childNode3 = new Node <String>("Boy"); 
        Pegawai.addChild("Roy", childNode1);
        Pegawai.addChild("Roy", childNode2);
        Pegawai.addChild("Mal", childNode3);

        Node<String> grandchildNode1 = new Node<String>("Ana");
        Node<String> grandchildNode2 = new Node<String>("Gal");
        Node<String> grandchildNode3 = new Node<String>("Abu");
        Node<String> grandchildNode4 = new Node<String>("Kim");

        Pegawai.addChild("Ica", grandchildNode1);
        Pegawai.addChild("Ica", grandchildNode2);
        Pegawai.addChild("Boy", grandchildNode3);
        Pegawai.addChild("Boy", grandchildNode4);
        
        Pegawai.draw();

        CariBawahan("Roy", Pegawai);
    } 
}

        