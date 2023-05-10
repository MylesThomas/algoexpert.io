# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        tree = program.BinaryTree(-1)
        tree.left = program.BinaryTree(2)
        tree.right = program.BinaryTree(-2)
        tree.right.left = program.BinaryTree(5)
        tree.right.right = program.BinaryTree(1)
        expected = 6
        actual = program.evaluateExpressionTree(tree)
        self.assertEqual(actual, expected)


    




# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)