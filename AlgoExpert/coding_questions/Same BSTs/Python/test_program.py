# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        arrayOne = [10, 15, 8, 12, 94, 81, 5, 2, 11]
        arrayTwo = [10, 8, 5, 15, 2, 12, 11, 94, 81]
        self.assertEqual(program.sameBsts(arrayOne, arrayTwo), True)

    def test_case_2(self):
        arrayOne =  [10, 15, 8, 12, 94, 81, 5, 2, -1, 101, 45, 12, 8, -1, 8, 2, -34]
        arrayTwo = [10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100]
        self.assertEqual(program.sameBsts(arrayOne, arrayTwo), False)

    def test_case_3(self):
        arrayOne = [1, 2, 3, 4, 5, 6, 7]
        arrayTwo = [1, 2, 3, 4, 5, 6, 7]
        self.assertEqual(program.sameBsts(arrayOne, arrayTwo), True)

    




# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)