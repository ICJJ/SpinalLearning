package DemoBits

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoBitsMain extends App {
  SpinalConfig(
    targetDirectory = "rtl/DemoBits"
  ).generateVerilog(new DemoBits)
}
