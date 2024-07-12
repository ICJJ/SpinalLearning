package DemoLogic

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoLogicMain extends App {
  SpinalConfig(
    targetDirectory = "rtl/DemoLogic"
  ).generateVerilog(new DemoLogic)
}
