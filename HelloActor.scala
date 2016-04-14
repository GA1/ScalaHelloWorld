import akka.actor.Actor
import spray.routing._
 
class HelloActor extends Actor with HelloService {
 
  def actorRefFactory = context
 
  def receive = runRoute(helloWorldRoute)
}
