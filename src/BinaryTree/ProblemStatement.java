package BinaryTree;

import BinaryTree.problems.*;

class ProblemStatement {
    void functionToRun(String functionName, BinaryTreeNode node) {

        BinaryTreeUtilsFunctions utilFunctions = new BinaryTreeUtilsFunctions();
        switch (Problems.valueOf(functionName.toUpperCase())) {

            case PROBLEM0:
                NonRecursiveBinaryTreeTraversal nonRecursiveBinaryTreeTraversal = new NonRecursiveBinaryTreeTraversal();
                nonRecursiveBinaryTreeTraversal.printLevelOrder(node);
                break;

            case PROBLEM1:
                System.out.print("\n\nSize of binary Tree : " + String.valueOf(utilFunctions.sizeOfBinaryTree(node)));
                break;

            case PROBLEM2:
                System.out.print("\n\nMaximum Value in Tree is; " + String.valueOf(utilFunctions.maxElementInBinaryTree(node)));
                break;

            case PROBLEM9: {
                ReverseLevelOrder reverseLevelOrder = new ReverseLevelOrder();
                reverseLevelOrder.levelOrderTraversalInReverse(node);
                break;
            }

            case PROBLEM10: {
                System.out.print("\n\nHeight of binary Tree : " + String.valueOf(utilFunctions.heightOfTree(node)));
                break;
            }

            case PROBLEM13: {
                MinimumDepthOfBinaryTree mdbt = new MinimumDepthOfBinaryTree();
                System.out.print("\n\nMinimum Depth of binary Tree : " + String.valueOf(mdbt.minimumDepthOfTree(node)));
                break;
            }

            case PROBLEM14: {
                DeepestNodeInBinaryTree dnbt = new DeepestNodeInBinaryTree();
                dnbt.deepMostLeftLeafNode(node);
                break;
            }

            case PROBLEM15: {
                DeepestNodeInBinaryTree dnbt = new DeepestNodeInBinaryTree();
                System.out.print("\n\nDeepest Node In Binary Tree: " + String.valueOf(dnbt.deepestNodeInBinaryTreeWithQueue(node).getData()));
                break;
            }

            case PROBLEM15_1: {
                new DeepestNodeInBinaryTree().getAllDeepestNodes(node);
                break;
            }
            case PROBLEM16: {
                new DeepestNodeInBinaryTree().countAllLeafNodeWithoutRecursion(node);
                break;
            }

            case PROBLEM16_1: {
                new DeepestNodeInBinaryTree().countAllLeafNodeUsingRecursion(node);
                break;
            }

            case PROBLEM17: {
                new DeepestNodeInBinaryTree().getAllLeafNode(node);
                break;
            }

            case PROBLEM20: {
                new DiameterOfBinaryTree().getDiameterOfBinaryTree(node);
                break;
            }

            case PROBLEM21_1: {
                WidthOfBinaryTree widthOfBinaryTree = new WidthOfBinaryTree();
                System.out.print("\n\n The maximum width of the tree is: " + widthOfBinaryTree.maxWidthOfBinaryTreeWithLevelOrder(node));
                break;
            }

            case PROBLEM21_2: {
                WidthOfBinaryTree widthOfBinaryTree = new WidthOfBinaryTree();
                System.out.print("\n\n The maximum width of the tree is: " + widthOfBinaryTree.maxWidthUsingPreOrderTraversal(node));
                break;
            }

            case PROBLEM22: {
                new LevelWithMaximumSum().levelWithMaximumSum(node);
                break;
            }

            case PROBLEM23: {
                new AllRootToLeafPath().printAllRootToLeafPath(node);
                break;
            }

            case PROBLEM24: {
                System.out.println("\n The sum for the data is found as " + new HasPathSum().hasPathSum(node, 155, 0));
                break;
            }
            case PROBLEM36: {
                System.out.println("\n The sum for the data is found as " + new BinaryTreeWithGivenNodes().numberOfBSTs(3));
                break;
            }

            case PROBLEM37: {
                new GenerateBSTs().generateAllBSTWithGivenNodes(3);
                break;
            }

            case PROBLEM35: {
                new VerticalSum().findMaxVerticalSum(node);
                break;
            }

            case PROBLEM32: {
                int[] data = {10, 50, 45, 60, 55, 51};
                new PrintAncestorOfNode().printAncestor(node, new BinaryTreeNode(51));
                break;
            }
            case PROBLEM33: {

                new LeastCommonAncestor().findLeastCommonAncestor(node, 45, 100);
                break;
            }
            case PROBLEM34: {
                new ZigZagTraversal().zigZagTraversalOfBinaryTree(node);
                break;
            }

            case PROBLEM29: {
//              Inorder sequence: D B E A F C
//              Preorder sequence: A B D E C F
                int in[] = {4, 2, 5, 1, 6, 3};
                int pre[] = {1, 2, 4, 5, 3, 6};
                new BTreeUsingInAndPreOrder().generateBTFromInAndPreOrderTraversal(pre, in);
                break;
            }

            case PROBLEM38: {
                BuildTreeFromPreOrder buildTreeFromPreOrder = new BuildTreeFromPreOrder();
                char[] abc = {'I', 'L', 'I', 'L', 'L'};
                BinaryTreeNode newNnode = buildTreeFromPreOrder.buildTreeFromPreOrder(abc, 0);
                BinaryTreeTraversal btt = new BinaryTreeTraversal();
                btt.preOrderTraversal(newNnode);
                break;
            }

            case PROBLEM_MORRIS: {
                MorrisTraversal morrisTraversal = new MorrisTraversal();
                morrisTraversal.morrisTraversalAlgo(node, "IN");
                BinaryTreeTraversal btt = new BinaryTreeTraversal();
                System.out.println("\n\nPrint the pre order traversal");
                btt.preOrderTraversal(node);
                break;
            }

            case PROBLEM_REVERSE_BINARY_TREE: {

                LevelOrderTraversalLevelWise levelOrderTraversal = new LevelOrderTraversalLevelWise();
                System.out.println("\n\nPrint the level order traversal");
                levelOrderTraversal.LevelOrderTraversalLevelWise(node);
                break;
            }


            default:
                // code block
        }
    }


    public enum Problems {
        PROBLEM0,
        PROBLEM1,
        PROBLEM2,
        PROBLEM9,
        PROBLEM10,
        PROBLEM13,
        PROBLEM14,
        PROBLEM15,
        PROBLEM15_1,
        PROBLEM16,
        PROBLEM16_1,
        PROBLEM17,
        PROBLEM20,
        PROBLEM21_1,
        PROBLEM21_2,
        PROBLEM22,
        PROBLEM23,
        PROBLEM24,
        PROBLEM36,
        PROBLEM37,
        PROBLEM35,
        PROBLEM29,
        PROBLEM32,
        PROBLEM38,
        PROBLEM33,
        PROBLEM34,
        PROBLEM_MORRIS,
        PROBLEM_REVERSE_BINARY_TREE
    }
}


//        BinaryTreeTraversal btt = new BinaryTreeTraversal();
//        NonRecursiveBinaryTreeTraversal bttNonRecur = new NonRecursiveBinaryTreeTraversal();
//        BinaryTreeUtilsFunctions utilFunctions = new BinaryTreeUtilsFunctions();

//        System.out.println("\n\nPrint the pre order traversal");
//        btt.preOrderTraversal(binaryTree.root);
//        System.out.println("\n\nNon recursive");
//        bttNonRecur.preOrderTraversal(binaryTree.root);
//
//        System.out.println("\n\nPrint the In order traversal");
//        btt.inOrderTraversal(binaryTree.root);
//        System.out.println("\n\nNon recursive");
//        bttNonRecur.inOrderTraversal(binaryTree.root);
//
//        System.out.println("\n\nPrint the Post order traversal");
//        btt.postOrderTraversal(binaryTree.root);
//        System.out.println("\n\nNon recursive");
//        bttNonRecur.postOrderTraversal(binaryTree.root);
//
//        System.out.print("\n\nLevel Order\n");
//        bttNonRecur.printLevelOrder(binaryTree.root);
//
