package DemoBlackBox

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoBlackBoxMain extends App {
  SpinalConfig(targetDirectory =
    "rtl/DemoBlackBox"
  ).generateVerilog(new DemoBlackBox)
}
