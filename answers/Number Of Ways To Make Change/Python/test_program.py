# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        self.assertEqual(program.numberOfWaysToMakeChange(6, [1, 5]), 2)

    def test_case_2(self):
        self.assertEqual(program.numberOfWaysToMakeChange(0, [1, 5]), 1)

    def test_case_3(self):
        self.assertEqual(program.numberOfWaysToMakeChange(0, [1, 5, 10, 20, 100]), 1)

    


    





# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)