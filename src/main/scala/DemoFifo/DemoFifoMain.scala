package DemoFifo

import spinal.core._
import spinal.core.sim._
import spinal.lib._

import scala.language.postfixOps

object DemoFifoMain extends App {
  SimConfig.withWave.compile(new DemoFifo).doSim{dut =>
    sleep(10)
  }
}
