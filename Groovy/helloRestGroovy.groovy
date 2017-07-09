@RestController
class GreeetingsRestController {
	
	@RequestMapping("/hi/{name}")
	def hi(@PathVariable String name) {
		[ greeting: "Hello, " + name + "!"];
	}
}