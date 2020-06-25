import org.scalatest.FunSuite

class SquaredStringSuite extends FunSuite {

  test("An empty string is squared string") {
    val emptyStr: SquaredString = new SquaredString("")

    assert(emptyStr.isSquared == true)
  }

  test("An empty string is transformed to empty string") {
    val emptyStr: SquaredString = new SquaredString("")

    assert(emptyStr.transform == "")
  }

  test("Root side of empty string is 0") {
    val emptyStr: SquaredString = new SquaredString("")

    assert(emptyStr.root == 0)
  }

  test("Null passed to SquaredString constructor causes NullPointerException") {
    assertThrows[NullPointerException] {
      new SquaredString(null)
    }
  }

  test("A string 'AAA' will be transformed to 'AA\\nA" + 11.toChar.toString + "'") {
    val str: SquaredString = new SquaredString("AAA")

    assert(str.transform == "AA\\nA" + 11.toChar.toString)
  }

  test("Root of transformed 'AAA' is 2") {
    val str: SquaredString = new SquaredString("AAA")
    str.transform

    assert(str.root == 2)
  }
}
