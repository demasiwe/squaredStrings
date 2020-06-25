import scala.math.{floor, pow, sqrt}

class SquaredString(str: String) {

  private val VT: String = 11.toChar.toString
  var root: Double = sqrt(str.length)

  def isSquared(): Boolean = {
    root = sqrt(str.length)
    (root - floor(root)) == 0
  }

  def completeToSquared(): String = {
    if (isSquared) {
      str
    } else {
      root = floor(sqrt(str.length)) + 1
      str + VT * (pow(root, 2).toInt - str.length)
    }
  }

  def insertDelimeter(sqrdStr: String): String = {
    val newStr: StringBuilder = new StringBuilder(sqrdStr)

    try {
      val indices: List[Int] = List.range(0, sqrdStr.length, root.toInt).filter(_ != 0)

      indices.map(x => {
        val mult = if (indices.indexOf(x) == 0) 0 else 1
        indices.indexOf(x) + x + 1 * indices.indexOf(x) * mult
      }).foreach(indx => {
        newStr.insert(indx, "\\n")
      })
    } catch {
      case e: IllegalArgumentException => None
    }

    newStr.toString
  }

  def transform(): String = {
    insertDelimeter(completeToSquared())
  }

}
