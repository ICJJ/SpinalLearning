package DemoBool

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

object DemoBoolMain extends App {
      SpinalConfig(
        targetDirectory = "rtl/DemoBool"
    ).generateVerilog(new DemoBool )
}
