@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello World!"
    }

    @ResquestMappin("/karabo")
    String karabo(){
        return  "Hello Karabo";
    }

}