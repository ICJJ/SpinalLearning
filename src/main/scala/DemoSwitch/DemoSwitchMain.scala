package DemoSwitch

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoSwitchMain extends App {
  SpinalConfig(targetDirectory = "rtl/DemoSwitch"
  ).generateVerilog(new DemoSwitch)
}
