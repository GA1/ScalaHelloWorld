import spray.routing._
trait HelloService extends HttpService {
 
 val helloWorldRoute =
   get {
     complete("Hello World!")
   }
}