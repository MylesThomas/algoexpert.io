# This file is initialized with a code version of this
# question's sample test case. Feel free to add, edit,
# or remove test cases in this file as you see fit!

import program
import unittest


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        number = "462839"
        numDigits = 2
        expected = "6839"
        actual = program.bestDigits(number, numDigits)
        self.assertEqual(actual, expected)

    def test_case_2(self):
        number = "9999"
        numDigits = 2
        expected = "99"
        actual = program.bestDigits(number, numDigits)
        self.assertEqual(actual, expected)

    





# keep this at bottom
if __name__ == '__main__':
    unittest.main(verbosity=2)