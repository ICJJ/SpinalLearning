package DemoEnum

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoEnumMain extends App {
  SpinalConfig(
    targetDirectory = "rtl/DemoEnum",
    enumPrefixEnable = false
  ).generateVerilog(new DemoEnum)
}
