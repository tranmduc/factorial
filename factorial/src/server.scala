import java.io.PrintStream
import java.net.{ServerSocket, Socket}
import java.util.Scanner

object server extends App{
  val ss = new ServerSocket(4000)
  val sock:Socket = ss.accept()
  val in = new Scanner(sock.getInputStream)
  val out = new PrintStream(sock.getOutputStream)

  val number = in.nextInt()

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  val temp = factorial(number)
  out.println(temp)
}
