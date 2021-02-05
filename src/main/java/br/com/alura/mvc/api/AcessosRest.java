package br.com.alura.mvc.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.interceptor.InterceptadorDeAcessos;
import br.com.alura.mvc.interceptor.InterceptadorDeAcessos.Acesso;

@RestController
@RequestMapping("acessos")
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos(){
		return InterceptadorDeAcessos.acessos;
	}
}
