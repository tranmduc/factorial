import java.io.PrintStream
import java.net.Socket
import java.util.Scanner

object client extends App{
  val scanner = new Scanner(System.in)
  val socket = new Socket("localhost", 4000)
  val in = new Scanner(socket.getInputStream)
  val out = new PrintStream(socket.getOutputStream)

  println("Enter a number: ")

  val number= scanner.nextInt()
  out.println(number)

  val temp = in.nextInt()

  println(number + "! = " + temp)

}
