// You need scalatest installed!

import org.scalatest.FunSuite

class CiccioSuite extends FunSuite {
    test("Just testing random things") {
        val x = 1
        val y = 2
        assert(x==y)
    }
}

(new CiccioSuite).execute()
