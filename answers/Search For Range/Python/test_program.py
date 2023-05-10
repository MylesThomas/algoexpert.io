# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        self.assertEqual(program.searchForRange([0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73], 45), [4, 9])

    def test_case_2(self):
        self.assertEqual(program.searchForRange([0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73], 4555555), [-1, -1])

    

    

    






# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)