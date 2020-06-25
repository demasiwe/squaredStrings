import org.scalatest.FunSuite

class EncoderSuite extends FunSuite {

  test("An empty string is encoded to empty string") {
    val encoder: Encoder = new Encoder()

    assert(encoder.code("") == "")
  }

  test("Null passed to Encoder causes NullPointerException") {
    val encoder: Encoder = new Encoder()

    assertThrows[NullPointerException] {
      encoder.code(null)
    }
  }

  test("Example for coding from codewars task") {
    val encoder: Encoder = new Encoder()

    assert(encoder.code("I.was.going.fishing.that.morning.at.ten.o'clock")
      ==
      "c.nhsoI\\nltiahi.\\noentinw\\ncng.nga\\nk..mg.s\\n\\voao.f.\\n\\v'trtig".replace("\\v", 11.toChar.toString))
  }

  test("Example for decoding from codewars task") {
    val encoder: Encoder = new Encoder()

    assert(encoder
      .decode("c.nhsoI\\nltiahi.\\noentinw\\ncng.nga\\nk..mg.s\\n\\voao.f.\\n\\v'trtig".replace("\\v", 11.toChar.toString))
      == "I.was.going.fishing.that.morning.at.ten.o'clock")
  }

  test("'Get.High' will be encoded to 'g.G\\nhHe\n\\vit'".replace("\\v", 11.toChar.toString)) {
    val encoder: Encoder = new Encoder()

    assert(encoder.code("Get.High") == "g.G\\nhHe\\n\\vit".replace("\\v", 11.toChar.toString))
  }
}
