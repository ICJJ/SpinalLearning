package DemoVec

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoVecMain extends App {
  SpinalConfig(targetDirectory = "rtl/DemoVec"
  ).generateVerilog(new DemoVec)
}
