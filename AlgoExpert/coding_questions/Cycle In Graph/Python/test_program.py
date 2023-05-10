# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        input = [[1, 3], [2, 3, 4], [0], [], [2, 5], []]
        expected = True
        actual = program.cycleInGraph(input)
        self.assertEqual(actual, expected)

    def test_case_2(self):
        input = [[], [], [], [], [], []]
        expected = False
        actual = program.cycleInGraph(input)
        self.assertEqual(actual, expected)

    def test_case_3(self):
        input = [[], [], [], [], [], [5]]
        expected = True
        actual = program.cycleInGraph(input)
        self.assertEqual(actual, expected)

    





# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)