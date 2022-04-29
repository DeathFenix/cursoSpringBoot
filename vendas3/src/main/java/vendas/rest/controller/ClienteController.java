package vendas.rest.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vendas.entity.Cliente;
import vendas.repository.Clientes;

@Controller
@RequestMapping("/api/clientes")
public class ClienteController {
	
//	@RequestMapping(value = "/hello/{nome}", method = RequestMethod.GET)
//	@ResponseBody
//	public String helloCliente(@PathVariable("nome") String nomeCliente ) {
//		return String.format("Hello %s.", nomeCliente);
//	}
	
	private Clientes clientes;
	
	public ClienteController(Clientes clientes) {
		this.clientes = clientes;
	}



	@GetMapping("/api/clientes/{id}")
	@ResponseBody
	public ResponseEntity getClienteById(@PathVariable Integer id ) {
		//Optional<Cliente> cliente = clientes.findById(id);	
		
		//if(cliente.isPresent()) {
			return ResponseEntity.ok("ok");
		//}
		
		//return ResponseEntity.notFound().build();
	}

}
