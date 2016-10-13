import akka.actor.ActorSystem
import akka.actor.Props
import akka.japi.Creator

class Application {
    static void main(String[] args){
        def system = ActorSystem.create("HelloSystem")
        // (3) changed this line of code
        def helloActor = system.actorOf(Props.create(HelloActor, "Groovy"), "helloactor")
        helloActor.tell("hello", helloActor.noSender())

        helloActor.tell("hallo", helloActor.noSender())
    }
}
