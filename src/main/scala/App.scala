object App extends App {
  val encoder: Encoder = new Encoder()

  val stringToCode = "I.was.going.fishing.that.morning.at.ten.o'clock"
  val stringToDecode = "c.nhsoI\\nltiahi.\\noentinw\\ncng.nga\\nk..mg.s\\n\\voao.f.\\n\\v'trtig"
    .replace("\\v", 11.toChar.toString)

  args.length match {
    case 0 => None
    case _ => {
      val stringToCode = args(0)
      val stringToDecode = args(1)
    }
  }

  println(encoder.code(stringToCode))
  println(encoder.decode(stringToDecode))
}
