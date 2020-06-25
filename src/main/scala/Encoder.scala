import scala.math.{sqrt, floor, ceil, pow}

class Encoder() {

  private val VT: String = 11.toChar.toString

  def createMatrix(delimitedStr: String): Array[Array[Char]] = {
    delimitedStr.split("""\\n""").map(row => row.toCharArray)
  }

  def code(str: String): String = {
    val sqrdString = new SquaredString(str)
    createMatrix(sqrdString.transform).reverse.transpose.map(row => row.mkString("")).mkString("\\n")
  }

  def decode(str: String): String = {
    createMatrix(str).transpose.reverse.map(row => row.mkString("")).mkString("").replace(VT, "")
  }

}
