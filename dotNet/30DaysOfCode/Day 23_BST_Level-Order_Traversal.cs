using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
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

    static void levelOrder(Node root)
    {
        Node travLeft, travRight;
        int leftBranchCount, rightBranchCount, branchRunLeft, branchRunRight;

        branchRunLeft = branchRunRight = leftBranchCount = rightBranchCount = 0;
        travLeft = travRight = root;

        bool finished = false;
        List<int> tree = new List<int>() { travLeft.data };
        int count = 0;

        if (travLeft.left == null && travRight.right == null)
            Console.WriteLine(travLeft.data);

        // LEFT IS ALWAYS FIRST

        do
        {

            if (travLeft.left != null)
            {
                tree.Add(travLeft.left.data);
                travLeft = travLeft.left;
                Console.WriteLine("left {0}", count);
                count++;
            }

            if (travRight.right != null)
            {
                tree.Add(travRight.right.data);
                travRight = travRight.right;
                Console.WriteLine("right {0}", count);
                count++;
            }


            // else if(travLeft.right != null)
            // {
            //     travLeft=travLeft.right;
            //     tree.Add(travLeft.right.data);
            // };        



            // else if(travRight.left != null)
            // {
            //     travRight=travRight.left;
            //     tree.Add(travRight.left.data);
            // }

            //   if (travLeft.left==null && travLeft.right==null)
            //     branchRunLeft=1;

            // if (travRight.left==null && travRight.right==null)
            //   branchRunRight=1;    
            ////   if (count==3)
            // if (branchRunLeft==1 && branchRunRight==1)
            //  finished=true;

        } while (count == 6);
        // tree.Add(travLeft.left.data);
        // tree.Add(travRight.right.data);
        foreach (int leaf in tree)
            Console.Write("{0} ", leaf);
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
        levelOrder(root);

    }
