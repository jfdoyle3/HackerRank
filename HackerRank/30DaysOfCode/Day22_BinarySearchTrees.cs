using System;
class Node
{
    public Node left, right;
    public int data;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class Solution
{

    static int getHeight(Node root)
    {
        Node travLeft, travRight;
        int leftBranchCount, rightBranchCount, branchRunLeft, branchRunRight;

        branchRunLeft = branchRunRight = leftBranchCount = rightBranchCount = 0;
        travLeft = travRight = root;

        bool finished = false;
        int[] results = new int[2];

        if (travLeft.left == null && travRight.right == null)
            return 0;

        do
        {

            if (travLeft.left != null)
            {
                travLeft = travLeft.left;
                leftBranchCount++;
            }
            
            if (travLeft.right != null && travLeft.left==null)
            {
                travLeft = travLeft.right;
                leftBranchCount++;
            }

            if (travLeft.left == null && travLeft.right == null)
            {
                results[0] = leftBranchCount;
                branchRunLeft = 1;
            }

            if (travRight.right != null)
            {
                travRight = travRight.right;
                rightBranchCount++;
            }

            if (travRight.left != null)
            {
                travRight = travRight.left;
                rightBranchCount++;
            }
            if (travRight.left == null && travRight.right == null)
            {
                results[1] = rightBranchCount;
                branchRunRight = 1;
            }
            if (branchRunLeft == 1 && branchRunRight == 1)
                finished = true;

        } while (!finished);

        //Console.WriteLine("results: L:{0} | R:{1}",results[0],results[1]);
        //  Console.WriteLine("Left branch Main: {0}",results[0]);
        if (results[0] > results[1])
            return results[0];
        else
            return results[1];
    }

    static Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        }
        else
        {
            Node cur;
            if (data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    static void Main(String[] args)
    {
        Node root = null;
        int T = Int32.Parse(Console.ReadLine());
        while (T-- > 0)
        {
            int data = Int32.Parse(Console.ReadLine());
            root = insert(root, data);
        }
        int height = getHeight(root);
        Console.WriteLine(height);

    }
}