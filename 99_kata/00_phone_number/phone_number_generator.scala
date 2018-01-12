/*
* Write a function that accepts an array of 10 integers (between 0 and 9),
* that returns a string of those numbers in the form of a phone number.
*
* (1, 2, 3, 4, 5, 6, 7, 8, 9, 0) => returns "(123) 456-7890"
* */

def createPhoneNumber(numbers: Seq[Int]): String = {
  s"(${numbers.slice(0,3).mkString}) ${numbers.slice(3,6).mkString}-${numbers.slice(6,10).mkString}"
}

println(createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))