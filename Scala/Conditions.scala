import scala.io.StdIn.{readLine, readInt}

//import scala.collections.mutable.ArrayBuffer;
//import java.io.PrintWriter
//import scala.io.Source

object Conditions  {
	def main(args: Array[String]): Unit = {
		
		var numberGuess = 0;
		var numToGuess = 15;
		/*do {
			print("Guess a number ");
			numberGuess = readLine.toInt;
		} while (numberGuess != numToGuess);

		printf("You guessed the secret number %d\n", numToGuess);
		*/

		val name = "Den";
		val age = 35;
		val weight = 55.55;

		println(s"Hello $name");
		println(f"I am ${age + 1} and weight $weight%.4f");

	}	
}