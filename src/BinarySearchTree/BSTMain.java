package BinarySearchTree;

import BinarySearchTree.problems.*;
import BinaryTree.BinaryTreeNode;
import BinaryTree.BinaryTreeTraversal;

public class BSTMain {

    public static void main(String[] args) {


        BinaryTreeNode root = new BinaryTreeNode(50);
        new InitialiseBST().initialise(root);

//        FindElementInBST findElementInBST = new FindElementInBST();
//        findElementInBST.findElement(root, 43, "RECURSIVE");
//        findElementInBST.findElement(root, 43, "ITERATIVE");
//
//        FindMinInBST findMinInBST = new FindMinInBST();
//        findMinInBST.findMinElement(root, "RECURSIVE");
//        findMinInBST.findMinElement(root, "ITERATIVE");
//
//        FindMaxInBST findMaxInBST = new FindMaxInBST();
//        findMaxInBST.findMaxElement(root, "RECURSIVE");
//        findMaxInBST.findMaxElement(root, "ITERATIVE");

//        FindLCAInBST findLCAInBST = new FindLCAInBST();
//        findLCAInBST.findLCAInBST(root, 30, 43);

//        GreaterSumTree greaterSumTree = new GreaterSumTree();
//        greaterSumTree.greaterSumTreeFromBST(root);

//        InPlaceBSTToCDLL inPlaceBSTToCDLL = new InPlaceBSTToCDLL();
//        BinaryTreeNode finalList = inPlaceBSTToCDLL.binaryTreeToCDoubleList(root);
//        inPlaceBSTToCDLL.displayCircularLinkedlistForBST(finalList);

//        int[] array = {10, 20, 30, 40, 50};
//        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
//        System.out.println();
//        sortedArrayToBST.sortedArrayToBST(array);
//
//        BinaryTreeTraversal btt = new BinaryTreeTraversal();
//        System.out.println();
//        btt.preOrderTraversal(root);

        SortedDLLToBST sortedDLLToBST = new SortedDLLToBST();
        sortedDLLToBST.sortedDLLtoBST();


    }

}
