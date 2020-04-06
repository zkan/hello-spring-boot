@RestController
class HelloWorld {
    @RequestMapping("/")
    public String hello() {
        return "Hello, World !!";
    }
}
