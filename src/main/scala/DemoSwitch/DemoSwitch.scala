package DemoSwitch

import spinal.core._
import spinal.lib._
import scala.language.postfixOps

class DemoSwitch extends Component {

  val a0 = in Bits(5 bits)
  val a1 = out Bits(5 bits)
  switch(a0){
    is(0){ a1 := 0}
    is(1){ a1 := 1}
    is(2){ a1 := 2}
    is(3){ a1 := 3}
    default {a1 := 5}
  }

  val b0 = in Bits(5 bits)
  val b1 = out Bits(5 bits)
  switch(b0){
    is(M"1----"){ b1 := B"5'd0"}
    is(M"-1---"){ b1 := B"5'd0"}
    is(M"--1--"){ b1 := B"5'd0"}
    is(M"---1-"){ b1 := B"5'd0"}
    default {b1 := B"5'd5"}
  }

  val c0 = in Bits(5 bits)
  val c1 = out Bits(5 bits)
  switch(c0) {
    is(0, 1, 2, 3) {
      c1 := 0
    }
    default {
      c1 := 5
    }
  }
}
