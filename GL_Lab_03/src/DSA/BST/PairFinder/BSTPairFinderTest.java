package DSA.BST.PairFinder;

public class BSTPairFinderTest {
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = BSTUtils.sampleBST();
		
		BSTPairFinder pairFinder = 
			new BSTPairFinder(bst, 120);
		
		pairFinder.findPairs();

}
}
