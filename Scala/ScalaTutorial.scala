object Scala {
	def main(args: Array[String])	{
		var i = 0;

		while ( i < 10 ) {
			print(i + ", ");
			i += 1;
		}
		println();

		do {
			print(i + ", ");
			i+=2;
		} while ( i <= 20);
		println();

		for ( i <- 1 to 9) 
			print(i + ", ");
		println();

		var randLetters = "ASDSAFKNKJBIYGBIOJN";
		for(i <- 0 until randLetters.length) 
			print(randLetters(i));
		println();

		val aList = List(1, 3, 2, 6, 5);
		for(i <- aList) {
			println("List items: " + i)
		}

		val evenList = for { i <- 1 to 20
			if (i % 2 ==0)
		}	yield i;

		print("EvenList: ")
		for(i <- evenList) 
			print(i + ", ");
		println();

		for( i <- 1 to 5; j <- 6 to 10) {
			println("i: " + i + "; j: " + j);
		}
	}
}