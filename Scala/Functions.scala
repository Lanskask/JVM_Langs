import scala.util.control.Breaks

object Functions {
  def main(args: Array[String]): Unit = {
    var i = 0;

    def printPrimes() = {
	  	val primeList = List(1, 2, 3, 5, 7, 11);
	  	
	  	/*val loop = new Breaks;
	    loop.breakable {
	    	for (i <- primeList) {
		  		if(i == 11) loop.break;

		  		if ( i!= 1 ) {
		  			print(i + ", ")
		  		}
		  	}
	    }

	  	/*for (i <- primeList) {
	  		if(i == 11) {
	  			return
	  		}

	  		if ( i!= 1 ) {
	  			print(i + ", ")
	  		}
	  	}*/
  	}
	  printPrimes()

    /*var sum = 0
    def findSum {
      for (i <- 0 to 10) {
        sum += i;
        if (sum >= 10) return
      }
    }
    findSum
    println(sum);
    */


  }
}
