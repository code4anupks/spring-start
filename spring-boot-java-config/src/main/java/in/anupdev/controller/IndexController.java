package in.anupdev.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String healthCheck() {
		return "Hello!.. application is running fine... enjoy.";
	}
	@RequestMapping("/list")
	public List<String> showList() {
		String[] n = {"Anup", "Moni", "Soni"};
		return Arrays.asList(n);
	}

	@RequestMapping("/list/{number}")
	public String getIndexedName(@PathVariable int number) {
		if (number > 0) {
			String[] n = {"Anup", "Moni", "Soni"};

			if (n.length >= number)
				return n[number - 1];
			else
				return "pagle tu aukad se jayada magng raha hai.. teri aukad "
						+ n.length + "hain. iske under mang";
		} else
			return "pagle 0 se kuch na milega. number de 0 se bada";
	}

	@RequestMapping("/{name}")
	public String getIndexedName(@PathVariable String name) {
		return "Hello! .... " + name + ". Welcome to SpringBoot World.";
	}
}
