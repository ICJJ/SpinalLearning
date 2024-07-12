package DemoUintSint

import spinal.core._
import spinal.core.sim._
import spinal.lib._

import scala.language.postfixOps

object DemoUintSintMain extends App {
  SpinalConfig(
    targetDirectory = "rtl/DemoUintSint"
  ).generateVerilog(new DemoUintSint)

  SimConfig.withVCS.withWave.compile(new DemoUintSint).doSimUntilVoid{
    dut =>
      sleep(10)
      println(dut.d5.toInt)
      simSuccess()
  }
}
